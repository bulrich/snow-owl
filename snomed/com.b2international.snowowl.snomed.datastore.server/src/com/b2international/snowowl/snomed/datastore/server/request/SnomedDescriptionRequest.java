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
package com.b2international.snowowl.snomed.datastore.server.request;

import com.b2international.snowowl.core.api.IBranchPath;
import com.b2international.snowowl.core.domain.RepositoryContext;
import com.b2international.snowowl.core.events.BaseRequest;
import com.b2international.snowowl.snomed.core.domain.ISnomedDescription;
import com.b2international.snowowl.snomed.datastore.index.entry.SnomedDescriptionIndexEntry;
import com.b2international.snowowl.snomed.datastore.services.SnomedBranchRefSetMembershipLookupService;
import com.google.common.base.Function;

/**
 * @since 4.5
 */
abstract class SnomedDescriptionRequest<C extends RepositoryContext, B> extends BaseRequest<C, B> {

	protected final Function<SnomedDescriptionIndexEntry, ISnomedDescription> getConverter(IBranchPath branchPath) {
		return new SnomedDescriptionConverter(new SnomedBranchRefSetMembershipLookupService(branchPath));
	}
	
}
