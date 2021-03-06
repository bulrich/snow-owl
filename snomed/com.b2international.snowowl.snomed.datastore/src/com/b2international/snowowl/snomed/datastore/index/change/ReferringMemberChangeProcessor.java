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
package com.b2international.snowowl.snomed.datastore.index.change;

import java.io.IOException;
import java.util.Collection;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.revision.delta.CDOFeatureDelta;
import org.eclipse.emf.cdo.common.revision.delta.CDORevisionDelta;
import org.eclipse.emf.cdo.common.revision.delta.CDOSetFeatureDelta;

import com.b2international.index.revision.RevisionSearcher;
import com.b2international.snowowl.datastore.ICDOCommitChangeSet;
import com.b2international.snowowl.datastore.cdo.CDOIDUtils;
import com.b2international.snowowl.snomed.datastore.index.entry.SnomedRefSetMemberIndexEntry;
import com.b2international.snowowl.snomed.datastore.index.refset.RefSetMemberChange;
import com.b2international.snowowl.snomed.datastore.index.refset.RefSetMemberChange.MemberChangeKind;
import com.b2international.snowowl.snomed.snomedrefset.SnomedRefSetMember;
import com.b2international.snowowl.snomed.snomedrefset.SnomedRefSetPackage;
import com.b2international.snowowl.snomed.snomedrefset.SnomedRefSetType;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

/**
 * @since 5.2
 */
final class ReferringMemberChangeProcessor {
	
	private final short referencedComponentType;

	public ReferringMemberChangeProcessor(final short referencedComponentType) {
		this.referencedComponentType = referencedComponentType;
	}
	
	public Multimap<String, RefSetMemberChange> process(ICDOCommitChangeSet commitChangeSet, RevisionSearcher searcher) throws IOException {
		final Multimap<String, RefSetMemberChange> memberChanges = HashMultimap.create();
		
		// process new members
		filterRefSetMembers(commitChangeSet.getNewComponents(), referencedComponentType)
			.forEach((newMember) -> {
				if (newMember.isActive()) {
					addChange(memberChanges, newMember, MemberChangeKind.ADDED);
				}
			});
		
		// process dirty members
		filterRefSetMembers(commitChangeSet.getDirtyComponents(), referencedComponentType)
			.forEach((dirtyMember) -> {
				final CDORevisionDelta revisionDelta = commitChangeSet.getRevisionDeltas().get(dirtyMember.cdoID());
				if (revisionDelta != null) {
					final CDOFeatureDelta changeStatusDelta = revisionDelta.getFeatureDelta(SnomedRefSetPackage.Literals.SNOMED_REF_SET_MEMBER__ACTIVE);
					if (changeStatusDelta instanceof CDOSetFeatureDelta) {
						CDOSetFeatureDelta delta = (CDOSetFeatureDelta) changeStatusDelta;
						final Boolean oldValue = (Boolean) delta.getOldValue();
						final Boolean newValue = (Boolean) delta.getValue();
						if (Boolean.TRUE == oldValue && Boolean.FALSE == newValue) {
							addChange(memberChanges, dirtyMember, MemberChangeKind.REMOVED);
						} else if (Boolean.FALSE == oldValue && Boolean.TRUE == newValue) {
							addChange(memberChanges, dirtyMember, MemberChangeKind.ADDED);
						}
					}
				}
			});
		
		// process detached members
		final Iterable<CDOID> detachedComponents = commitChangeSet.getDetachedComponents(SnomedRefSetPackage.Literals.SNOMED_REF_SET_MEMBER);
		final Iterable<Long> detachedMemberStorageKeys = CDOIDUtils.createCdoIdToLong(detachedComponents);
		final Iterable<SnomedRefSetMemberIndexEntry> detachedMembers = searcher.get(SnomedRefSetMemberIndexEntry.class, detachedMemberStorageKeys);
		
		StreamSupport.stream(detachedMembers.spliterator(), false)
			.filter(doc ->
				doc.isActive() && referencedComponentType == doc.getReferencedComponentType())
			.forEach(doc -> {
				final String uuid = doc.getId();
				final String referencedComponentId = doc.getReferencedComponentId();
				final String refSetId = doc.getReferenceSetId();
				memberChanges.put(referencedComponentId, new RefSetMemberChange(uuid, refSetId, MemberChangeKind.REMOVED, doc.getReferenceSetType()));
			});
		
		return memberChanges;
	}
	
	private static Stream<SnomedRefSetMember> filterRefSetMembers(final Collection<CDOObject> objects, short referencedComponentType) {
		return objects.stream()
			.filter(SnomedRefSetMember.class::isInstance)
			.map(SnomedRefSetMember.class::cast)
			.filter(member -> referencedComponentType == member.getReferencedComponentType());
	}

	private void addChange(final Multimap<String, RefSetMemberChange> memberChanges, SnomedRefSetMember member, MemberChangeKind changeKind) {
		final String uuid = member.getUuid();
		final String refSetId = member.getRefSetIdentifierId();
		final SnomedRefSetType refSetType = member.getRefSet().getType();
		memberChanges.put(member.getReferencedComponentId(), new RefSetMemberChange(uuid, refSetId, changeKind, refSetType));
	}

}
