/*
 * Copyright 2011-2017 B2i Healthcare Pte Ltd, http://b2i.sg
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
package com.b2international.snowowl.snomed.datastore.id.memory;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Collection;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.b2international.commons.VerhoeffCheck;
import com.b2international.snowowl.core.exceptions.BadRequestException;
import com.b2international.snowowl.core.terminology.ComponentCategory;
import com.b2international.snowowl.datastore.store.MemStore;
import com.b2international.snowowl.datastore.store.Store;
import com.b2international.snowowl.snomed.datastore.config.SnomedIdentifierConfiguration;
import com.b2international.snowowl.snomed.datastore.id.AbstractSnomedIdentifierService;
import com.b2international.snowowl.snomed.datastore.id.SnomedIdentifier;
import com.b2international.snowowl.snomed.datastore.id.SnomedIdentifiers;
import com.b2international.snowowl.snomed.datastore.id.cis.IdentifierStatus;
import com.b2international.snowowl.snomed.datastore.id.cis.SctId;
import com.b2international.snowowl.snomed.datastore.id.gen.ItemIdGenerationStrategy;
import com.b2international.snowowl.snomed.datastore.id.reservations.ISnomedIdentiferReservationService;
import com.b2international.snowowl.snomed.datastore.internal.id.reservations.SnomedIdentifierReservationServiceImpl;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * {@link Store} based implementation of the identifier service.
 * 
 * @since 4.5
 */
public class DefaultSnomedIdentifierService extends AbstractSnomedIdentifierService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultSnomedIdentifierService.class);

	private final Store<SctId> store;
	private final ItemIdGenerationStrategy generationStrategy;

	/*
	 * Tests only
	 */
	DefaultSnomedIdentifierService(final ItemIdGenerationStrategy generationStrategy) {
		this(new MemStore<SctId>(), generationStrategy, new SnomedIdentifierReservationServiceImpl(), new SnomedIdentifierConfiguration());
	}
	
	public DefaultSnomedIdentifierService(final Store<SctId> store, final ItemIdGenerationStrategy generationStrategy,
			final ISnomedIdentiferReservationService reservationService, final SnomedIdentifierConfiguration config) {
		super(reservationService, config);
		
		store.configureSearchable(SctId.Fields.NAMESPACE);
		store.configureSearchable(SctId.Fields.PARTITION_ID);
		store.configureSearchable(SctId.Fields.SEQUENCE);
		store.configureSortable(SctId.Fields.SEQUENCE);
		
		this.store = store;
		this.generationStrategy = generationStrategy;
	}

	@Override
	public SctId getSctId(final String componentId) {
		final SctId storedSctId = store.get(componentId);

		if (null != storedSctId) {
			return storedSctId;
		} else {
			return buildSctId(componentId, IdentifierStatus.AVAILABLE);
		}
	}

	@Override
	public Collection<SctId> getSctIds() {
		return store.values();
	}

	@Override
	public String generate(final String namespace, final ComponentCategory category) {
		checkNotNull(category, "Component category must not be null.");
		checkCategory(category);

		LOGGER.debug(String.format("Generating component ID for category %s.", category.getDisplayName()));

		final String componentId = generateId(namespace, category);
		final SctId sctId = buildSctId(componentId, IdentifierStatus.ASSIGNED);
		store.put(componentId, sctId);

		return componentId;
	}

	@Override
	public void register(final String componentId) {
		LOGGER.debug(String.format("Registering component ID %s.", componentId));

		final SctId sctId = getSctId(componentId);
		if (!sctId.matches(IdentifierStatus.AVAILABLE, IdentifierStatus.RESERVED)) {
			LOGGER.warn(String.format("Cannot register ID %s as it is already present with status %s.", componentId, sctId.getStatus()));
		} else {
			sctId.setStatus(IdentifierStatus.ASSIGNED.getSerializedName());
			store.put(componentId, sctId);
		}
	}

	@Override
	public String reserve(final String namespace, final ComponentCategory category) {
		checkNotNull(category, "Component category must not be null.");
		checkCategory(category);

		LOGGER.debug(String.format("Reserving component ID for category %s.", category.getDisplayName()));

		final String componentId = generateId(namespace, category);
		final SctId sctId = buildSctId(componentId, IdentifierStatus.RESERVED);
		store.put(componentId, sctId);

		return componentId;
	}

	@Override
	public void deprecate(final String componentId) {
		final SctId sctId = getSctId(componentId);
		if (sctId.matches(IdentifierStatus.ASSIGNED, IdentifierStatus.PUBLISHED)) {
			LOGGER.debug(String.format("Deprecating component ID %s.", componentId));

			sctId.setStatus(IdentifierStatus.DEPRECATED.getSerializedName());
			store.put(componentId, sctId);
		} else if (!sctId.isDeprecated()) {
			throw new BadRequestException(String.format("Cannot deprecate ID in state %s.", sctId.getStatus()));
		}
	}

	@Override
	public void release(final String componentId) {
		final SctId sctId = getSctId(componentId);
		if (sctId.matches(IdentifierStatus.ASSIGNED, IdentifierStatus.RESERVED)) {
			LOGGER.debug(String.format("Releasing component ID %s.", componentId));
			store.remove(componentId);
		} else if (!sctId.isAvailable()) {
			throw new BadRequestException(String.format("Cannot release ID in state %s.", sctId.getStatus()));
		}
	}

	@Override
	public void publish(final String componentId) {
		final SctId sctId = getSctId(componentId);
		if (sctId.isAssigned()) {
			LOGGER.debug("Publishing component ID {}.", componentId);
			sctId.setStatus(IdentifierStatus.PUBLISHED.getSerializedName());
			store.put(componentId, sctId);
		} else if (!sctId.isPublished()) {
			throw new BadRequestException("Cannot publish ID '%s' in state %s.", sctId.getSctid(), sctId.getStatus());
		}
	}

	@Override
	public Collection<String> generate(final String namespace, final ComponentCategory category, final int quantity) {
		checkNotNull(category, "Component category must not be null.");
		checkCategory(category);

		LOGGER.debug(String.format("Generating %d component IDs for category %s.", quantity, category.getDisplayName()));

		final Map<String, SctId> sctIds = Maps.newHashMap();
		final Collection<String> componentIds = generateIds(namespace, category, quantity);

		for (final String componentId : componentIds) {
			final SctId sctId = buildSctId(componentId, IdentifierStatus.ASSIGNED);
			sctIds.put(componentId, sctId);
		}

		store.putAll(sctIds);
		return componentIds;
	}

	@Override
	public void register(final Collection<String> componentIds) {
		final Map<String, SctId> sctIds = Maps.newHashMap();
		final Collection<String> registeredComponentIds = Lists.newArrayList();

		LOGGER.debug(String.format("Registering %d component IDs.", componentIds.size()));

		try {
			for (final String componentId : componentIds) {
				final SctId sctId = getSctId(componentId);

				if (!sctId.matches(IdentifierStatus.AVAILABLE, IdentifierStatus.RESERVED)) {
					LOGGER.warn(String.format("Cannot register ID %s as it is already present with status %s.", componentId,
							sctId.getStatus()));
				} else {
					sctId.setStatus(IdentifierStatus.ASSIGNED.getSerializedName());
					sctIds.put(componentId, sctId);
					registeredComponentIds.add(componentId);
				}
			}

			store.putAll(sctIds);
		} catch (Exception e) {
			// remove the registered component IDs
			store.removeAll(registeredComponentIds);
			throw e;
		}
	}

	@Override
	public Collection<String> reserve(final String namespace, final ComponentCategory category, final int quantity) {
		checkNotNull(category, "Component category must not be null.");
		checkCategory(category);

		LOGGER.debug(String.format("Reserving %d component IDs for category %s.", quantity, category.getDisplayName()));

		final Map<String, SctId> sctIds = Maps.newHashMap();
		final Collection<String> componentIds = generateIds(namespace, category, quantity);

		for (final String componentId : componentIds) {
			final SctId sctId = buildSctId(componentId, IdentifierStatus.RESERVED);
			sctIds.put(componentId, sctId);
		}

		store.putAll(sctIds);
		return componentIds;
	}

	@Override
	public void deprecate(final Collection<String> componentIds) {
		final Map<String, SctId> deprecatedSctIds = Maps.newHashMap();

		LOGGER.debug(String.format("Deprecating %d component IDs.", componentIds.size()));

		for (final String componentId : componentIds) {
			final SctId sctId = getSctId(componentId);

			if (sctId.matches(IdentifierStatus.ASSIGNED, IdentifierStatus.PUBLISHED)) {
				sctId.setStatus(IdentifierStatus.DEPRECATED.getSerializedName());
				deprecatedSctIds.put(componentId, sctId);
			} else if (!sctId.isDeprecated()) {
				throw new BadRequestException(String.format("Cannot deprecate ID in state %s.", sctId.getStatus()));
			}
		}

		store.putAll(deprecatedSctIds);
	}

	@Override
	public void release(final Collection<String> componentIds) {
		final Collection<String> releasedComponentIds = Lists.newArrayList();

		LOGGER.debug(String.format("Releasing %d component IDs.", componentIds.size()));

		for (final String componentId : componentIds) {
			final SctId sctId = getSctId(componentId);

			if (sctId.matches(IdentifierStatus.ASSIGNED, IdentifierStatus.RESERVED)) {
				releasedComponentIds.add(componentId);
			} else if (!sctId.isAvailable()) {
				throw new BadRequestException(String.format("Cannot release ID in state %s.", sctId.getStatus()));
			}
		}

		store.removeAll(releasedComponentIds);
	}

	@Override
	public void publish(final Collection<String> componentIds) {
		final Map<String, SctId> publishedSctIds = Maps.newHashMap();

		LOGGER.debug("Publishing {} component IDs.", componentIds.size());

		for (final String componentId : componentIds) {
			final SctId sctId = getSctId(componentId);

			if (sctId.isAssigned()) {
				sctId.setStatus(IdentifierStatus.PUBLISHED.getSerializedName());
				publishedSctIds.put(componentId, sctId);
			} else if (!sctId.isPublished()) {
				throw new BadRequestException("Cannot publish ID '%s' in state '%s'.", sctId.getSctid(), sctId.getStatus());
			}
		}

		store.putAll(publishedSctIds);
	}

	@Override
	public Collection<SctId> getSctIds(final Collection<String> componentIds) {
		LOGGER.debug(String.format("Getting %d SctIds.", componentIds.size()));
		final Collection<SctId> sctIds = Lists.newArrayList();
		for (final String componentId : componentIds) {
			sctIds.add(getSctId(componentId));
		}

		return sctIds;
	}

	private String generateId(final String namespace, final ComponentCategory category) {
		return generateIds(namespace, category, 1).iterator().next();
	}

	private Collection<String> generateIds(final String namespace, final ComponentCategory category, final int quantity) {
		final Collection<String> componentIds = Lists.newArrayList();

		while (componentIds.size() < quantity) {
			String componentId = generateComponentId(namespace, category);
			int i = 1;
			while (isReserved(componentId)) {
				if (i == getConfig().getMaxIdGenerationAttempts()) {
					throw new BadRequestException("Couldn't generate identifier in %s number of attempts", getConfig().getMaxIdGenerationAttempts());
				}
				componentId = generateComponentId(namespace, category);
				i++;
			}

			componentIds.add(componentId);
		}

		return componentIds;
	}
	
	private boolean isReserved(String componentId) {
		return getReservationService().isReserved(componentId) || store.containsKey(componentId);
	}

	@Override
	public boolean importSupported() {
		return true;
	}

	private String generateComponentId(final String namespace, final ComponentCategory category) {
		final String selectedNamespace = selectNamespace(namespace);
		final StringBuilder builder = new StringBuilder();

		// generate the SCT Item ID (value can be a function of component category and namespace)
		builder.append(generationStrategy.generateItemId(selectedNamespace, category));

		// append namespace and the first part of the partition-identifier
		if (Strings.isNullOrEmpty(selectedNamespace)) {
			builder.append('0');
		} else {
			builder.append(selectedNamespace);
			builder.append('1');
		}

		// append the second part of the partition-identifier
		builder.append(category.ordinal());

		// calc check-digit
		builder.append(VerhoeffCheck.calculateChecksum(builder, false));

		return builder.toString();
	}

	private SctId buildSctId(final String componentId, final IdentifierStatus status) {
		final SnomedIdentifier identifier = SnomedIdentifiers.create(componentId);
		final SctId sctId = new SctId();
		sctId.setSctid(componentId);
		sctId.setStatus(status.getSerializedName());
		sctId.setSequence(identifier.getItemId());
		sctId.setNamespace(identifier.getNamespace());
		sctId.setPartitionId(String.format("%s%s", identifier.getFormatIdentifier(), identifier.getComponentIdentifier()));
		sctId.setCheckDigit(identifier.getCheckDigit());

		// TODO set remaining attributes
		return sctId;
	}

}
