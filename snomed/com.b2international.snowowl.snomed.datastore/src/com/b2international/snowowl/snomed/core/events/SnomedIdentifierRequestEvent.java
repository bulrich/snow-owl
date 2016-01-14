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
package com.b2international.snowowl.snomed.core.events;

import static com.google.common.base.Preconditions.checkNotNull;

import com.b2international.snowowl.core.terminology.ComponentCategory;

/**
 * New unique SNOMED CT Identifier generation request event.
 * 
 * @since 4.0
 */
public class SnomedIdentifierRequestEvent {

	private ComponentCategory category;
	private String namespace;

	public SnomedIdentifierRequestEvent(ComponentCategory category) {
		this(category, null);
	}
	
	public SnomedIdentifierRequestEvent(ComponentCategory category, String namespace) {
		this.category = checkNotNull(category, "category");
		this.namespace = namespace;
	}

	public ComponentCategory getCategory() {
		return category;
	}

	public String getNamespace() {
		return namespace;
	}

}