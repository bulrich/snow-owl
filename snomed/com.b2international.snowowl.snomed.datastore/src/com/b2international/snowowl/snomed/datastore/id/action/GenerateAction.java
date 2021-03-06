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
package com.b2international.snowowl.snomed.datastore.id.action;

import com.b2international.snowowl.core.terminology.ComponentCategory;
import com.b2international.snowowl.snomed.datastore.id.request.AbstractSnomedIdentifierCountedRequestBuilder;
import com.b2international.snowowl.snomed.datastore.request.SnomedRequests;

/**
 * @since 4.5
 */
public class GenerateAction extends AbstractCountedIdAction {

	public GenerateAction(final String namespace, final ComponentCategory category, final int quantity) {
		super(namespace, category, quantity);
	}
	
	@Override
	protected AbstractSnomedIdentifierCountedRequestBuilder<?> createRequestBuilder() {
		return SnomedRequests.identifiers().prepareGenerate();
	}

}
