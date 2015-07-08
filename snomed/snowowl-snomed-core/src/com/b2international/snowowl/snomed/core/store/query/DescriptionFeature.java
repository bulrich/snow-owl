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
package com.b2international.snowowl.snomed.core.store.query;

import static com.google.common.base.Preconditions.checkNotNull;

import com.b2international.snowowl.core.store.query.NestedFeature;
import com.b2international.snowowl.core.store.query.NestedPath;
import com.b2international.snowowl.snomed.core.store.index.SnomedIndexConstants;

/**
 * @since 5.0
 */
public enum DescriptionFeature implements NestedFeature {
	TYPE_ID(ConceptNestedPath.DESCRIPTIONS, SnomedIndexConstants.TYPE_ID),
	LANGUAGE_CODE(ConceptNestedPath.DESCRIPTIONS, SnomedIndexConstants.LANGUAGE_CODE),
	CASE_SENSITIVITY_ID(ConceptNestedPath.DESCRIPTIONS, SnomedIndexConstants.CASE_SENSITIVITY_ID),
	TERM(ConceptNestedPath.DESCRIPTIONS, SnomedIndexConstants.TERM);
	
	private final String field;
	private final NestedPath path;

	private DescriptionFeature(NestedPath path, String field) {
		this.path = checkNotNull(path, "path");
		this.field = checkNotNull(field, "field");
	}
	
	@Override
	public String getField() {
		return path.getPath() + "." + field;
	}

	@Override
	public NestedPath getPath() {
		return path;
	}
	
}