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
package com.b2international.snowowl.snomed.datastore.internal.id;

import com.b2international.snowowl.core.terminology.ComponentCategory;
import com.b2international.snowowl.snomed.datastore.id.SnomedIdentifierValidator;
import com.b2international.snowowl.snomed.datastore.id.SnomedIdentifiers;

/**
 * @since 4.4
 */
public class SnomedComponentIdentifierValidator implements SnomedIdentifierValidator {

	private ComponentCategory category;

	public SnomedComponentIdentifierValidator(ComponentCategory category) {
		this.category = category;
	}
	
	@Override
	public boolean isValid(String componentId) {
		try {
			return category.equals(SnomedIdentifiers.getComponentCategory(componentId));
		} catch (IllegalArgumentException e) {
			return false;
		}
	}
	
	

}
