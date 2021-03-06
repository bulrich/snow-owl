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
package com.b2international.snowowl.snomed.datastore.index.update;

import com.b2international.collections.PrimitiveSets;
import com.b2international.collections.longs.LongCollection;
import com.b2international.collections.longs.LongCollections;
import com.b2international.collections.longs.LongSet;
import com.b2international.snowowl.core.domain.IComponent;
import com.b2international.snowowl.snomed.datastore.index.entry.SnomedConceptDocument;
import com.b2international.snowowl.snomed.datastore.taxonomy.ISnomedTaxonomyBuilder;

/**
 * @since 4.3
 */
public class ParentageUpdater {

	private final ISnomedTaxonomyBuilder taxonomyBuilder;
	private final boolean stated;

	public ParentageUpdater(ISnomedTaxonomyBuilder taxonomyBuilder, boolean stated) {
		this.taxonomyBuilder = taxonomyBuilder;
		this.stated = stated;
	}
	
	public void update(final String id, SnomedConceptDocument.Builder doc) {
		LongSet parents = PrimitiveSets.newLongOpenHashSet(getParentIds(id));
		LongSet ancestors = PrimitiveSets.newLongOpenHashSet(getAncestorIds(id));
		
		// index/add ROOT_ID if parentIds are empty
		if (parents.isEmpty()) {
			parents.add(IComponent.ROOT_IDL);
		} else {
			ancestors.add(IComponent.ROOT_IDL);
		}

		if (stated) {
			doc.statedParents(parents);
			doc.statedAncestors(ancestors);
		} else {
			doc.parents(parents);
			doc.ancestors(ancestors);
		}
	}

	protected LongCollection getParentIds(final String conceptId) {
		if (taxonomyBuilder.containsNode(conceptId)) {
			return taxonomyBuilder.getAncestorNodeIds(conceptId);
		}
		return LongCollections.emptySet();
	}

	protected LongCollection getAncestorIds(final String conceptId) {
		if (taxonomyBuilder.containsNode(conceptId)) {
			return taxonomyBuilder.getAllIndirectAncestorNodeIds(conceptId);
		}
		return LongCollections.emptySet();
	}
	
	protected ISnomedTaxonomyBuilder getTaxonomyBuilder() {
		return taxonomyBuilder;
	}

}
