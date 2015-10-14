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
package com.b2international.snowowl.snomed.datastore.internal.boot;

import org.eclipse.core.runtime.IProgressMonitor;

import com.b2international.snowowl.core.config.SnowOwlConfiguration;
import com.b2international.snowowl.core.setup.DefaultBootstrapFragment;
import com.b2international.snowowl.core.setup.Environment;
import com.b2international.snowowl.core.setup.ModuleConfig;
import com.b2international.snowowl.eventbus.IEventBus;
import com.b2international.snowowl.snomed.datastore.SnomedTerminologyBrowser;
import com.b2international.snowowl.snomed.datastore.config.SnomedCoreConfiguration;
import com.b2international.snowowl.snomed.datastore.id.ISnomedIdentifierGenerator;
import com.b2international.snowowl.snomed.datastore.internal.id.SnomedIdentifierGeneratorFactory;
import com.b2international.snowowl.snomed.metadata.SnomedMetadata;
import com.b2international.snowowl.snomed.metadata.SnomedMetadataImpl;

/**
 * @since 3.4
 */
@ModuleConfig(fieldName = "snomed", type = SnomedCoreConfiguration.class)
public class SnomedCoreBootstrap extends DefaultBootstrapFragment {

	@Override
	public void init(SnowOwlConfiguration configuration, Environment env) throws Exception {
		ISnomedIdentifierGenerator idGenerator = SnomedIdentifierGeneratorFactory.create();
		
		env.services().registerService(ISnomedIdentifierGenerator.class, idGenerator);
		env.services().registerService(SnomedCoreConfiguration.class, configuration.getModuleConfig(SnomedCoreConfiguration.class));
		env.services().registerService(SnomedMetadata.class, new SnomedMetadataImpl(env.provider(SnomedTerminologyBrowser.class)));
	}

	@Override
	public void run(SnowOwlConfiguration configuration, Environment env, IProgressMonitor monitor) throws Exception {
		// TODO figure out how to properly register Handler to specific endpoints in core services,
		// It would be nice to use a framework like reactor
		// Also if we stick with the current IEventBus impl, we should definitely implement routers
		if (env.isServer() || env.isEmbedded()) {
			env.service(IEventBus.class).registerHandler("/snomed-ct/ids", new SnomedIdentifierServiceEventHandler(env.provider(ISnomedIdentifierGenerator.class)));
		}
	}

}
