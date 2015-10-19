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
package com.b2international.snowowl.snomed.datastore.internal.id.reservations;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.Set;

import org.junit.Test;

import com.b2international.snowowl.core.terminology.ComponentCategory;
import com.b2international.snowowl.snomed.SnomedConstants.Concepts;
import com.b2international.snowowl.snomed.datastore.id.reservations.Reservation;
import com.b2international.snowowl.snomed.datastore.id.reservations.Reservations;
import com.b2international.snowowl.snomed.datastore.internal.id.SnomedIdentifier;
import com.b2international.snowowl.snomed.datastore.internal.id.DefaultSnomedIdentifierGenerator;

/**
 * @since 4.0
 */
public class ReservationImplTest {

	@Test
	public void whenReservingSingleID_ThenItShouldConflictWithThatIDOnly() throws Exception {
		final Reservation single = Reservations.single(Concepts.ROOT_CONCEPT);
		assertTrue(single.includes(SnomedIdentifier.of(Concepts.ROOT_CONCEPT)));
		assertFalse(single.includes(SnomedIdentifier.of(Concepts.FULLY_DEFINED)));
		assertFalse(single.includes(SnomedIdentifier.of(Concepts.ADDITIONAL_RELATIONSHIP)));
	}
	
	@Test
	public void whenReservingRangeOfIDs_ThenItShouldConflictWithAllIDsInThatRangeIncludingBoundaries() throws Exception {
		final Set<ComponentCategory> components = Collections.singleton(ComponentCategory.CONCEPT);
		final Reservation range = Reservations.range(200, 300, null, components);
		for (int i = 200; i <= 300; i++) {
			assertTrue(range.includes(DefaultSnomedIdentifierGenerator.generateFrom(i, ComponentCategory.CONCEPT)));
		}
	}
	
}
