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
package com.b2international.snowowl.snomed.datastore.request;

import java.util.Collections;
import java.util.Map;

import com.b2international.snowowl.core.domain.TransactionContext;
import com.b2international.snowowl.core.events.Request;
import com.b2international.snowowl.core.events.Requests;

/**
 * @since 4.5
 */
public final class SnomedRefSetMemberCreateRequestBuilder extends BaseSnomedTransactionalRequestBuilder<SnomedRefSetMemberCreateRequestBuilder, String> {

	private Boolean active = Boolean.TRUE;
	private String moduleId;
	private String referenceSetId;
	private String referencedComponentId;
	private Map<String, Object> properties = Collections.emptyMap();
	
	SnomedRefSetMemberCreateRequestBuilder() {
		super();
	}
	
	public SnomedRefSetMemberCreateRequestBuilder setReferencedComponentId(String referencedComponentId) {
		this.referencedComponentId = referencedComponentId;
		return getSelf();
	}
	
	public SnomedRefSetMemberCreateRequestBuilder setActive(Boolean active) {
		this.active = active;
		return getSelf();
	}
	
	public SnomedRefSetMemberCreateRequestBuilder setModuleId(String moduleId) {
		this.moduleId = moduleId;
		return getSelf();
	}
	
	public SnomedRefSetMemberCreateRequestBuilder setReferenceSetId(String referenceSetId) {
		this.referenceSetId = referenceSetId;
		return getSelf();
	}
	
	public SnomedRefSetMemberCreateRequestBuilder setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return getSelf();
	}
	
	public SnomedRefSetMemberCreateRequestBuilder setSource(Map<String, Object> source) {
		setModuleId((String) source.get("moduleId"));
		setReferencedComponentId((String) source.get("referencedComponentId"));
		setReferenceSetId((String) source.get("referenceSetId"));
		setProperties(source);
		return getSelf();
	}
	
	@Override
	public Request<TransactionContext, String> doBuild() {
		final SnomedRefSetMemberCreateRequest req = new SnomedRefSetMemberCreateRequest();
		req.setActive(active == null ? Boolean.TRUE : active);
		req.setModuleId(moduleId);
		req.setReferencedComponentId(referencedComponentId);
		req.setReferenceSetId(referenceSetId);
		req.setProperties(properties);
		return req;
	}

	public Request<TransactionContext, Void> buildNoContent() {
		return Requests.noContent(build());
	}
	
}
