/*
 * Copyright 2011-2016 B2i Healthcare Pte Ltd, http://b2i.sg
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.b2international.snowowl.datastore.server.snomed.index;

import static com.b2international.snowowl.snomed.datastore.index.entry.SnomedDocument.Expressions.active;
import static com.b2international.snowowl.snomed.datastore.index.entry.SnomedRefSetMemberIndexEntry.Expressions.refSetTypes;
import static com.b2international.snowowl.snomed.datastore.index.entry.SnomedRefSetMemberIndexEntry.Expressions.referencedComponentIds;
import static com.b2international.snowowl.snomed.datastore.index.entry.SnomedRelationshipIndexEntry.Expressions.characteristicTypeIds;
import static com.b2international.snowowl.snomed.datastore.index.entry.SnomedRelationshipIndexEntry.Expressions.typeId;
import static com.google.common.collect.Sets.newHashSet;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.b2international.collections.PrimitiveLists;
import com.b2international.collections.PrimitiveMaps;
import com.b2international.collections.PrimitiveSets;
import com.b2international.collections.longs.LongIterator;
import com.b2international.collections.longs.LongKeyLongMap;
import com.b2international.collections.longs.LongKeyMap;
import com.b2international.collections.longs.LongSet;
import com.b2international.commons.collect.LongSets;
import com.b2international.commons.concurrent.equinox.ForkJoinUtils;
import com.b2international.index.Hits;
import com.b2international.index.query.Expression;
import com.b2international.index.query.Expressions;
import com.b2international.index.query.Query;
import com.b2international.index.revision.RevisionSearcher;
import com.b2international.snowowl.core.api.SnowowlRuntimeException;
import com.b2international.snowowl.snomed.SnomedConstants.Concepts;
import com.b2international.snowowl.snomed.datastore.ConcreteDomainFragment;
import com.b2international.snowowl.snomed.datastore.IsAStatement;
import com.b2international.snowowl.snomed.datastore.SnomedIsAStatement;
import com.b2international.snowowl.snomed.datastore.StatementFragment;
import com.b2international.snowowl.snomed.datastore.index.entry.SnomedConceptDocument;
import com.b2international.snowowl.snomed.datastore.index.entry.SnomedRefSetMemberIndexEntry;
import com.b2international.snowowl.snomed.datastore.index.entry.SnomedRelationshipIndexEntry;
import com.b2international.snowowl.snomed.snomedrefset.SnomedRefSetType;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;

/**
 * Class for building the bare minimum representation of the state of the SNOMED&nbsp;CT ontology before processing changes.
 * <p>
 * This class should be used to compare the ontology state with the outcome of the classification process.
 */
public class InitialReasonerTaxonomyBuilder extends AbstractReasonerTaxonomyBuilder {

	private final class GetActiveIsAStatementsRunnable implements Runnable {

		private final String taskName;
		private final AtomicReference<IsAStatement[]> isAStatementsReference;
		private final RevisionSearcher searcher;

		private GetActiveIsAStatementsRunnable(final RevisionSearcher searcher, final String taskName, 
				final AtomicReference<IsAStatement[]> isAStatementsReference) {
			this.searcher = searcher;
			this.taskName = taskName;
			this.isAStatementsReference = isAStatementsReference;
		}

		@Override
		public void run() {
			final Query<SnomedRelationshipIndexEntry> query = Query.select(SnomedRelationshipIndexEntry.class)
					.where(Expressions.builder()
							.must(active())
							.must(typeId(Concepts.IS_A))
							.must(characteristicTypeIds(getAllowedCharacteristicTypes()))
							.build())
					.limit(Integer.MAX_VALUE)
					.build();
			
			try {
				final Hits<SnomedRelationshipIndexEntry> hits = searcher.search(query);
				final IsAStatement[] statements = new SnomedIsAStatement[hits.getTotal()];
				int i = 0;
				for (SnomedRelationshipIndexEntry hit : hits) {
					statements[i] = new SnomedIsAStatement(hit.getSourceId(), hit.getDestinationId());
					i++;
				}
				
				isAStatementsReference.set(statements);
				checkpoint(taskName, "active IS A statements collection", stopwatch);
			} catch (IOException e) {
				throw new SnowowlRuntimeException(e);
			}
		}
	}

	private final class GetConceptIdsRunnable implements Runnable {

		private final String taskName;
		private final AtomicReference<LongSet> conceptIdsReference;
		private final Expression additionalClause;
		private final RevisionSearcher searcher;

		private GetConceptIdsRunnable(final RevisionSearcher searcher, final String taskName,
				final AtomicReference<LongSet> conceptIdsReference, 
				final Expression additionalClause) {

			this.searcher = searcher;
			this.taskName = taskName;
			this.conceptIdsReference = conceptIdsReference;
			this.additionalClause = additionalClause;
		}

		@Override
		public void run() {
			final Query<SnomedConceptDocument> query = Query.select(SnomedConceptDocument.class)
					.where(Expressions.builder()
							.must(active())
							.must(additionalClause)
							.build())
					.limit(Integer.MAX_VALUE)
					.build();

			try {
				final Hits<SnomedConceptDocument> hits = searcher.search(query);
				final LongSet ids = PrimitiveSets.newLongOpenHashSet(hits.getTotal());
				
				for (SnomedConceptDocument hit : hits) {
					ids.add(Long.parseLong(hit.getId()));
				}
				
				conceptIdsReference.set(ids);
				checkpoint(taskName, MessageFormat.format("active concept IDs collection ({0})", additionalClause), stopwatch);
			} catch (IOException e) {
				throw new SnowowlRuntimeException(e);
			}
		}
	}

	private final class GetConceptIdsAndKeysRunnable implements Runnable {

		private final String taskName;
		private final AtomicReference<LongKeyLongMap> conceptIdsReference;
		private final RevisionSearcher searcher;

		private GetConceptIdsAndKeysRunnable(final RevisionSearcher searcher, final String taskName,
				final AtomicReference<LongKeyLongMap> conceptIdsReference) {

			this.searcher = searcher;
			this.taskName = taskName;
			this.conceptIdsReference = conceptIdsReference;
		}

		@Override
		public void run() {
			final Query<SnomedConceptDocument> query = Query.select(SnomedConceptDocument.class)
					.where(active())
					.limit(Integer.MAX_VALUE)
					.build();
			
			try {
				
				final Hits<SnomedConceptDocument> hits = searcher.search(query);
				final LongKeyLongMap storageKeysById = PrimitiveMaps.newLongKeyLongOpenHashMapWithExpectedSize(hits.getTotal());
				
				for (SnomedConceptDocument hit : hits) {
					storageKeysById.put(Long.parseLong(hit.getId()), hit.getStorageKey());
				}
				
				conceptIdsReference.set(storageKeysById);
				checkpoint(taskName, "active concept IDs and storage keys collection", stopwatch);
			} catch (Exception e) {
				throw new SnowowlRuntimeException(e);
			}
			
		}
	}

	private final class TaxonomyBuilderRunnable implements Runnable {

		private final String taskName;
		private final AtomicReference<LongKeyLongMap> conceptIdsReference;
		private final AtomicReference<IsAStatement[]> isAStatementsReference;

		private TaxonomyBuilderRunnable(final String taskName, 
				final AtomicReference<LongKeyLongMap> conceptIdsReference,
				final AtomicReference<IsAStatement[]> isAStatementsReference) {

			this.taskName = taskName;
			this.conceptIdsReference = conceptIdsReference;
			this.isAStatementsReference = isAStatementsReference;
		}

		@Override
		public void run() {

			final LongKeyLongMap conceptIds = conceptIdsReference.get();
			final int conceptCount = conceptIds.size();

			internalIdToconceptId = PrimitiveLists.newLongArrayListWithExpectedSize(conceptCount);
			conceptIdToInternalId = PrimitiveMaps.newLongKeyIntOpenHashMapWithExpectedSize(conceptCount);

			LongIterator iterator = conceptIds.keySet().iterator();
			while (iterator.hasNext()) {
				final long conceptId = iterator.next();
				final long storageKey = conceptIds.get(conceptId);

				synchronized (storageKeyLock) {
					componentStorageKeyToConceptId.put(storageKey, conceptId);
				}
				
				internalIdToconceptId.add(conceptId);
				conceptIdToInternalId.put(conceptId, internalIdToconceptId.size() - 1);
			}

			final int[] outboundIsACount = new int[conceptCount];
			final int[] inboundIsACount = new int[conceptCount];

			superTypes = new int[conceptCount][];
			subTypes = new int[conceptCount][];

			final IsAStatement[] isAStatements = isAStatementsReference.get();

			// Count how many elements in the arrays we need for subtypes and supertypes
			for (final IsAStatement isAStatement : isAStatements) {

				final long sourceId = isAStatement.getSourceId();
				final long destinationId = isAStatement.getDestinationId();

				final int sourceInternalId = getInternalId(sourceId);
				final int destinationInternalId = getInternalId(destinationId);

				outboundIsACount[sourceInternalId]++;
				inboundIsACount[destinationInternalId]++;
			}

			for (int i = 0; i < conceptCount; i++) {
				superTypes[i] = new int[outboundIsACount[i]];
				subTypes[i] = new int[inboundIsACount[i]];
			}

			// Create last used index matrices for IS A relationships (initialized to 0 for all concepts)
			final int[] lastSuperTypeIdx = new int[conceptCount];
			final int[] lastSubTypeIdx = new int[conceptCount];

			// Register IS A relationships as subtype and supertype internal IDs
			for (final IsAStatement isAStatement : isAStatements) {

				final long sourceId = isAStatement.getSourceId();
				final long destinationId = isAStatement.getDestinationId();

				final int sourceInternalId = getInternalId(sourceId);
				final int destinationInternalId = getInternalId(destinationId);

				superTypes[sourceInternalId][lastSuperTypeIdx[sourceInternalId]++] = destinationInternalId;
				subTypes[destinationInternalId][lastSubTypeIdx[destinationInternalId]++] = sourceInternalId;
			}

			checkpoint(taskName, "building taxonomy", stopwatch);
		}
	}

	private final class GetConcreteDomainRunnable implements Runnable {

		private final String taskName;
		private final LongSet componentIds;
		private final Collection<String> characteristicTypes;
		private final AtomicReference<LongKeyMap<Collection<ConcreteDomainFragment>>> concreteDomainMapReference;
		private final RevisionSearcher searcher;

		private GetConcreteDomainRunnable(final RevisionSearcher searcher, final String taskName,
				final LongSet componentIds,
				final Collection<String> characteristicTypes,
				final AtomicReference<LongKeyMap<Collection<ConcreteDomainFragment>>> concreteDomainMapReference) {

			this.searcher = searcher;
			this.taskName = taskName;
			this.componentIds = componentIds;
			this.characteristicTypes = characteristicTypes;
			this.concreteDomainMapReference = concreteDomainMapReference;
		}

		@Override
		public void run() {
			final Query<SnomedRefSetMemberIndexEntry> query = Query.select(SnomedRefSetMemberIndexEntry.class)
					.where(Expressions.builder()
							.must(active())
							.must(referencedComponentIds(LongSets.toStringSet(componentIds)))
							.must(refSetTypes(Collections.singleton(SnomedRefSetType.CONCRETE_DATA_TYPE)))
							.must(characteristicTypeIds(characteristicTypes))
							.build())
					.limit(Integer.MAX_VALUE)
					.build();
					
			try {
				final Hits<SnomedRefSetMemberIndexEntry> hits = searcher.search(query);
				final LongKeyMap<Collection<ConcreteDomainFragment>> concreteDomainMap = PrimitiveMaps.newLongKeyOpenHashMapWithExpectedSize(hits.getTotal());

				for (final LongIterator keys = concreteDomainMap.keySet().iterator(); keys.hasNext(); /**/) {
					final long componentId = keys.next();
					if (!componentIds.contains(componentId)) {
						keys.remove(); //no matching active SNOMED CT component
					}
				}

				concreteDomainMapReference.set(concreteDomainMap);
				checkpoint(taskName, String.format("collecting concrete domain reference set members..."), stopwatch);
			} catch (IOException e) {
				throw new SnowowlRuntimeException(e);
			}
		}
	}

	private final class StatementMapperRunnable implements Runnable {

		private final RevisionSearcher searcher;
		private final String taskName;
		private final AtomicReference<LongKeyLongMap> statementIdToConceptIdReference;

		private StatementMapperRunnable(final RevisionSearcher searcher, final String taskName, final AtomicReference<LongKeyLongMap> statementIdToConceptIdReference) {

			this.searcher = searcher;
			this.taskName = taskName;
			this.statementIdToConceptIdReference = statementIdToConceptIdReference;
		}

		@Override
		public void run() {
			conceptIdToStatements = getStatements(getAllowedCharacteristicTypes());
			final LongKeyLongMap statementIdToConceptIds = PrimitiveMaps.newLongKeyLongOpenHashMapWithExpectedSize(conceptIdToStatements.size());

			for (final LongIterator itr = conceptIdToStatements.keySet().iterator(); itr.hasNext(); /* nothing */) {

				final long sourceConceptId = itr.next();
				final Collection<StatementFragment> fragments = getStatementFragments(sourceConceptId);

				for (final StatementFragment fragment : fragments) {
					final long statementStorageKey = fragment.getStorageKey();
					final long statemendId = fragment.getStatementId();
					
					synchronized (storageKeyLock) {
						componentStorageKeyToConceptId.put(statementStorageKey, sourceConceptId);
					}
					
					statementIdToConceptIds.put(statemendId, sourceConceptId);
				}
			}

			statementIdToConceptIdReference.set(statementIdToConceptIds);
			
			inferredStatementMap = getStatements(Collections.singleton(Concepts.INFERRED_RELATIONSHIP));
			checkpoint(taskName, "mapping statements for classification", stopwatch);
		}

		private LongKeyMap<Collection<StatementFragment>> getStatements(final Collection<String> characteristicTypes) {
			final Query<SnomedRelationshipIndexEntry> query = Query.select(SnomedRelationshipIndexEntry.class)
					.where(Expressions.builder()
							.must(active())
							.must(characteristicTypeIds(characteristicTypes))
							.build())
					.limit(Integer.MAX_VALUE)
					.build();
			
			try {
				final Hits<SnomedRelationshipIndexEntry> hits = searcher.search(query);
				final LongKeyMap<Collection<StatementFragment>> statementsBySourceId = PrimitiveMaps.newLongKeyOpenHashMapWithExpectedSize(hits.getTotal());
				
				for (SnomedRelationshipIndexEntry hit : hits) {
					final StatementFragment statement = new StatementFragment(
							Long.parseLong(hit.getTypeId()),
							Long.parseLong(hit.getDestinationId()),
							hit.isDestinationNegated(),
							hit.getGroup(),
							hit.getUnionGroup(),
							hit.isUniversal(),
							Long.parseLong(hit.getId()),
							hit.getStorageKey()
						);
					final long sourceId = Long.parseLong(hit.getSourceId());
					if (!statementsBySourceId.containsKey(sourceId)) {
						statementsBySourceId.put(sourceId, Lists.<StatementFragment>newArrayList());
					}
					statementsBySourceId.get(sourceId).add(statement);
				}
				
				return statementsBySourceId;
			} catch (IOException e) {
				throw new SnowowlRuntimeException(e);
			}
		}
	}

	public static final Logger LOGGER = LoggerFactory.getLogger(InitialReasonerTaxonomyBuilder.class);

	private static <T> AtomicReference<T> createAtomicReference() {
		return new AtomicReference<T>();
	}

	private static void entering(final String taskName) {
		LOGGER.info(MessageFormat.format(">>> {0}", taskName));
	}

	private static void checkpoint(final String taskName, final String message, final Stopwatch stopwatch) {
		LOGGER.info(MessageFormat.format("--- {0}: {1} [{2}]", taskName, message, stopwatch));
	}

	private static void leaving(final String taskName, final Stopwatch stopwatch) {
		LOGGER.info(MessageFormat.format("<<< {0} [{1}]", taskName, stopwatch));
	}

	private final Object storageKeyLock = new Object();
	private final Stopwatch stopwatch;
	
	private LongKeyMap<Collection<StatementFragment>> inferredStatementMap;
	private LongKeyMap<Collection<ConcreteDomainFragment>> inferredConcreteDomainMap;

	/**
	 * Creates a taxonomy builder instance.
	 *
	 * @param searcher - an active revision searcher on a branch where this reasoner taxonomy builder should collect data from
	 * @param type the mode of operation for this taxonomy builder (intended for classification or change processing)
	 */
	public InitialReasonerTaxonomyBuilder(final RevisionSearcher searcher, final Type type) {
		super(type);
		
		this.stopwatch = Stopwatch.createStarted();
		
		final String taskName = MessageFormat.format("Building reasoner taxonomy for branch path ''{0}''", searcher.branch());
		entering(taskName);

		final AtomicReference<LongKeyLongMap> conceptIdsReference = createAtomicReference();
		final AtomicReference<IsAStatement[]> isAStatementsReference = createAtomicReference();

		final Runnable getConceptIdsRunnable = new GetConceptIdsAndKeysRunnable(searcher, taskName, conceptIdsReference);
		final Runnable getIsAStatementsRunnable = new GetActiveIsAStatementsRunnable(searcher, taskName, isAStatementsReference);

		ForkJoinUtils.runInParallel(getIsAStatementsRunnable, getConceptIdsRunnable);

		final LongKeyLongMap conceptStorageKeysById = conceptIdsReference.get();
		
		final LongSet conceptIds = PrimitiveSets.newLongOpenHashSet();
		final LongIterator iterator = conceptStorageKeysById.keySet().iterator();
		while (iterator.hasNext()) {
			final long conceptId = iterator.next(); 
			conceptIds.add(conceptId);
		}

		componentStorageKeyToConceptId = PrimitiveMaps.newLongKeyLongOpenHashMapWithExpectedSize(conceptIds.size()); // Lower bound estimate
		
		final AtomicReference<LongSet> exhaustiveConceptIdsReference = createAtomicReference();
		final AtomicReference<LongSet> fullyDefinedConceptIdsReference = createAtomicReference();
		final AtomicReference<LongKeyMap<Collection<ConcreteDomainFragment>>> conceptConcreteDomainReference = createAtomicReference();
		final AtomicReference<LongKeyMap<Collection<ConcreteDomainFragment>>> inferredConceptConcreteDomainReference = createAtomicReference();
		final AtomicReference<LongKeyMap<Collection<ConcreteDomainFragment>>> relationshipConcreteDomainReference = createAtomicReference();
		final AtomicReference<LongKeyLongMap> statementIdToConceptIdReference = createAtomicReference();

		new StatementMapperRunnable(searcher, taskName, statementIdToConceptIdReference).run();
		
		final Runnable taxonomyBuilderRunnable = new TaxonomyBuilderRunnable(taskName, conceptIdsReference, isAStatementsReference);

		final Collection<String> allowedCharacteristicTypes = getAllowedCharacteristicTypes();
		final Runnable getConceptConcreteDomainsRunnable = new GetConcreteDomainRunnable(searcher, taskName, 
				conceptIds,
				allowedCharacteristicTypes,
				conceptConcreteDomainReference);

		final LongSet relationshipIds = statementIdToConceptIdReference.get().keySet();

		// XXX: Change processor mode needs additional concrete domain members as well (relationships only)
		if (!isReasonerMode()) {
			allowedCharacteristicTypes.add(Concepts.ADDITIONAL_RELATIONSHIP);
		}
		
		final Runnable getStatementConcreteDomainsRunnable = new GetConcreteDomainRunnable(searcher, taskName, 
				relationshipIds,
				allowedCharacteristicTypes,
				relationshipConcreteDomainReference);

		final Runnable getInferredConceptConcreteDomainsRunnable = new GetConcreteDomainRunnable(searcher, taskName, 
				conceptIds,
				Collections.singleton(Concepts.INFERRED_RELATIONSHIP),
				inferredConceptConcreteDomainReference);
		
		final Runnable getExhaustiveConceptIdsRunnable = new GetConceptIdsRunnable(searcher, taskName,
				exhaustiveConceptIdsReference, 
				SnomedConceptDocument.Expressions.exhaustive());

		final Runnable getFullyDefinedConceptIdsRunnable = new GetConceptIdsRunnable(searcher, taskName,
				fullyDefinedConceptIdsReference, 
				SnomedConceptDocument.Expressions.defining());

		ForkJoinUtils.runInParallel(
				taxonomyBuilderRunnable,
				getConceptConcreteDomainsRunnable,
				getInferredConceptConcreteDomainsRunnable,
				getStatementConcreteDomainsRunnable,
				getExhaustiveConceptIdsRunnable,
				getFullyDefinedConceptIdsRunnable);

		exhaustiveConceptIds = exhaustiveConceptIdsReference.get();
		fullyDefinedConceptIds = fullyDefinedConceptIdsReference.get();
		conceptIdToConcreteDomain = conceptConcreteDomainReference.get();
		inferredConcreteDomainMap = inferredConceptConcreteDomainReference.get();
		statementIdToConcreteDomain = relationshipConcreteDomainReference.get();

		for (final LongIterator itr = conceptIdToConcreteDomain.keySet().iterator(); itr.hasNext(); /* empty */) {
			final long conceptId = itr.next();
			final Collection<ConcreteDomainFragment> fragments = getConceptConcreteDomainFragments(conceptId);

			for (final ConcreteDomainFragment fragment : fragments) {
				synchronized (storageKeyLock) {
					componentStorageKeyToConceptId.put(fragment.getStorageKey(), conceptId);
				}
			}
		}

		for (final LongIterator itr = statementIdToConcreteDomain.keySet().iterator(); itr.hasNext(); /* empty */) {
			final long statementId = itr.next();
			final long conceptId = statementIdToConceptIdReference.get().get(statementId);
			final Collection<ConcreteDomainFragment> fragments = getConceptConcreteDomainFragments(statementId);

			for (final ConcreteDomainFragment fragment : fragments) {
				synchronized (storageKeyLock) {
					componentStorageKeyToConceptId.put(fragment.getStorageKey(), conceptId);
				}
			}
		}

		leaving(taskName, stopwatch);
	}
	
	public Collection<StatementFragment> getInferredStatementFragments(final long conceptId) {
		final Collection<StatementFragment> statements = inferredStatementMap.get(conceptId);
		return null == statements ? Collections.<StatementFragment>emptySet() : statements;
	}
	
	public Collection<ConcreteDomainFragment> getInferredConceptConcreteDomainFragments(final long conceptId) {
		final Collection<ConcreteDomainFragment> concreteDomains = inferredConcreteDomainMap.get(conceptId);
		return null == concreteDomains ? Collections.<ConcreteDomainFragment>emptySet() : concreteDomains;
	}

	private Collection<String> getAllowedCharacteristicTypes() {
		final Collection<String> result = newHashSet();
		result.add(Concepts.STATED_RELATIONSHIP);
		// XXX: Change processor mode requires all defining information, not just stated ones
		if (!isReasonerMode()) {
			result.add(Concepts.INFERRED_RELATIONSHIP);
			result.add(Concepts.DEFINING_RELATIONSHIP);
		}
		return result;
	}
	
}
