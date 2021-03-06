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
package com.b2international.snowowl.snomed.mrcm.core;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.b2international.snowowl.core.ApplicationContext;
import com.b2international.snowowl.snomed.mrcm.core.extensions.ExtensionBasedConceptModelExtensionProvider;
import com.b2international.snowowl.snomed.mrcm.core.extensions.ExtensionBasedConceptPropagatorProvider;
import com.b2international.snowowl.snomed.mrcm.core.extensions.ExtensionBasedConceptValidatorProvider;
import com.b2international.snowowl.snomed.mrcm.core.extensions.IConceptModelExtensionProvider;
import com.b2international.snowowl.snomed.mrcm.core.extensions.IConceptPropagatorProvider;
import com.b2international.snowowl.snomed.mrcm.core.extensions.IConceptValidatorProvider;

public class MrcmCoreActivator implements BundleActivator {
	
	public static final String PLUGIN_ID = "com.b2international.snowowl.snomed.mrcm.core";

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		MrcmCoreActivator.context = bundleContext;
		ApplicationContext.getInstance().registerService(IConceptValidatorProvider.class, new ExtensionBasedConceptValidatorProvider());
		ApplicationContext.getInstance().registerService(IConceptPropagatorProvider.class, new ExtensionBasedConceptPropagatorProvider());
		ApplicationContext.getInstance().registerService(IConceptModelExtensionProvider.class, new ExtensionBasedConceptModelExtensionProvider());
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		MrcmCoreActivator.context = null;
	}

}