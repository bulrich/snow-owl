/*
 * Copyright 2011-2015 B2i Healthcare Pte Ltd, http://b2i.sg
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
package com.b2international.snowowl.snomed.datastore.internal.id;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.b2international.snowowl.core.terminology.ComponentCategory;
import com.b2international.snowowl.snomed.SnomedConstants.Concepts;
import com.b2international.snowowl.snomed.datastore.id.ISnomedIdentifier;

/**
 * @since 4.0
 */
public class SnomedIdentifierTest {

	@Test
	public void whenCreatingBasicConceptIdentifierInShortFormat_ThenItShouldBeCreated() throws Exception {
		final ISnomedIdentifier id = SnomedIdentifier.of(Concepts.ROOT_CONCEPT);
		assertEquals(138875L, id.getItemId());
		assertNull(id.getNamespace());
		assertEquals(0, id.getPartitionIdentifier());
		assertEquals(0, id.getComponentIdentifier());
		assertEquals(5, id.getCheckDigit());
		assertEquals(ComponentCategory.CONCEPT, id.getComponentCategory());
	}
	
	@Test
	public void whenCreatingShortestConceptIdentifierInShortFormat_ThenItShouldBeCreated() throws Exception {
		final ISnomedIdentifier id = SnomedIdentifier.of("100005");
		assertEquals(100L, id.getItemId());
		assertNull(id.getNamespace());
		assertEquals(0, id.getPartitionIdentifier());
		assertEquals(0, id.getComponentIdentifier());
		assertEquals(5, id.getCheckDigit());
		assertEquals(ComponentCategory.CONCEPT, id.getComponentCategory());
	}
	
	@Test
	public void whenCreatingLongestConceptIdentifierInShortFormat_ThenItShouldBeCreated() throws Exception {
		final ISnomedIdentifier id = SnomedIdentifier.of(Concepts.DEFINITION_STATUS_ROOT);
		assertEquals(900000000000444L, id.getItemId());
		assertNull(id.getNamespace());
		assertEquals(0, id.getPartitionIdentifier());
		assertEquals(0, id.getComponentIdentifier());
		assertEquals(6, id.getCheckDigit());
		assertEquals(ComponentCategory.CONCEPT, id.getComponentCategory());
	}
	
	@Test
	public void whenCreatingDescriptionIdentifierInShortFormat_ThenItShouldBeCreated() throws Exception {
		final ISnomedIdentifier id = SnomedIdentifier.of("1290023401015");
		assertEquals(1290023401L, id.getItemId());
		assertNull(id.getNamespace());
		assertEquals(0, id.getPartitionIdentifier());
		assertEquals(1, id.getComponentIdentifier());
		assertEquals(5, id.getCheckDigit());
		assertEquals(ComponentCategory.DESCRIPTION, id.getComponentCategory());
	}
	
	@Test
	public void whenCreatingRelationshipIdentifierInShortFormat_ThenItShouldBeCreated() throws Exception {
		final ISnomedIdentifier id = SnomedIdentifier.of("9940000001029");
		assertEquals(9940000001L, id.getItemId());
		assertNull(id.getNamespace());
		assertEquals(0, id.getPartitionIdentifier());
		assertEquals(2, id.getComponentIdentifier());
		assertEquals(9, id.getCheckDigit());
		assertEquals(ComponentCategory.RELATIONSHIP, id.getComponentCategory());
	}

	@Test
	public void whenCreatingDescriptionIdentifierInLongFormat_ThenItShouldBeCreated() throws Exception {
		final ISnomedIdentifier id = SnomedIdentifier.of("1290000001117");
		assertEquals(129L, id.getItemId());
		assertEquals("0000001", id.getNamespace());
		assertEquals(1, id.getPartitionIdentifier());
		assertEquals(1, id.getComponentIdentifier());
		assertEquals(7, id.getCheckDigit());
		assertEquals(ComponentCategory.DESCRIPTION, id.getComponentCategory());
	}
	
	@Test
	public void whenCreatingRelationshipIdentifierInLongFormat_ThenItShouldBeCreated() throws Exception {
		final ISnomedIdentifier id = SnomedIdentifier.of("9940000001126");
		assertEquals(994L, id.getItemId());
		assertEquals("0000001", id.getNamespace());
		assertEquals(1, id.getPartitionIdentifier());
		assertEquals(2, id.getComponentIdentifier());
		assertEquals(6, id.getCheckDigit());
		assertEquals(ComponentCategory.RELATIONSHIP, id.getComponentCategory());
	}
	
	@Test
	public void whenCreatingSCTIdentifierInLongFormat_ThenItShouldBeCreated() throws Exception {
		final ISnomedIdentifier id = SnomedIdentifier.of("999999990989121104");
		assertEquals(99999999L, id.getItemId());
		assertEquals("0989121", id.getNamespace());
		assertEquals(1, id.getPartitionIdentifier());
		assertEquals(0, id.getComponentIdentifier());
		assertEquals(4, id.getCheckDigit());
		assertEquals(ComponentCategory.CONCEPT, id.getComponentCategory());
	}
	
}
