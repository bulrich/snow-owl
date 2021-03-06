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
package com.b2international.snowowl.datastore.server.snomed.jobs;

import com.b2international.snowowl.core.SnowOwlApplication;
import com.b2international.snowowl.core.api.SnowowlServiceException;
import com.b2international.snowowl.datastore.server.snomed.index.interest.SearchProfileServerManager;
import com.b2international.snowowl.datastore.serviceconfig.AbstractServerServiceConfigJob;
import com.b2international.snowowl.snomed.datastore.SnomedDatastoreActivator;
import com.b2international.snowowl.snomed.datastore.index.interest.ISearchProfileManager;

/**
 */
public class SearchProfileServerConfigJob extends AbstractServerServiceConfigJob<ISearchProfileManager> {

	private static final String JOB_NAME = "Search profile server service configuration...";

	public SearchProfileServerConfigJob() {
		super(JOB_NAME, SnomedDatastoreActivator.PLUGIN_ID);
	}

	/*
	 * (non-Javadoc)
	 * @see com.b2international.snowowl.datastore.serviceconfig.AbstractServerServiceConfigJob#getServiceClass()
	 */
	@Override
	protected Class<ISearchProfileManager> getServiceClass() {
		return ISearchProfileManager.class;
	}

	/*
	 * (non-Javadoc)
	 * @see com.b2international.snowowl.datastore.serviceconfig.AbstractServerServiceConfigJob#createServiceImplementation()
	 */
	@Override
	protected SearchProfileServerManager createServiceImplementation() throws SnowowlServiceException {
		return new SearchProfileServerManager(SnowOwlApplication.INSTANCE.getEnviroment().getDefaultsDirectory());
	}
}