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
package com.b2international.snowowl.core.boot;

import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Sets.newHashSet;

import java.io.File;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.URIUtil;
import org.osgi.framework.BundleContext;

import com.b2international.commons.platform.Extensions;
import com.b2international.snowowl.core.config.SnowOwlConfiguration;
import com.b2international.snowowl.core.internal.CoreActivator;

/**
 * @since 3.3
 */
public class Bootstrap {

	public static final String BOOTSTAP_FRAGMENTS_EXT = "com.b2international.snowowl.core.bootstrapFragments";

	private static final String OSGI_INSTALL_AREA = "osgi.install.area";

	private Collection<BootstrapFragment> extensions;

	private BundleContext bundleContext = CoreActivator.getContext();
	private String installDirectory = bundleContext.getProperty(OSGI_INSTALL_AREA);

	/**
	 * Constructs a new {@link Bootstrap} initializer with additionally defined fragments.
	 * 
	 * @param fragments
	 * @since 3.8
	 */
	public Bootstrap(BootstrapFragment... fragments) {
		this.extensions = Extensions.getExtensions(BOOTSTAP_FRAGMENTS_EXT, BootstrapFragment.class);
		if (fragments != null) {
			this.extensions.addAll(newHashSet(fragments));
		}
	}

	/**
	 * Returns the enclosing {@link BundleContext}.
	 * 
	 * @return
	 * @since 3.4
	 */
	public BundleContext getBundleContext() {
		return bundleContext;
	}

	/**
	 * Returns the current installation directory of the SnowOwl Application.
	 * 
	 * @return
	 * @since 3.4
	 */
	public File getInstallationDirectory() {
		try {
			return URIUtil.toFile(URIUtil.fromString(installDirectory));
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Initializes all currently existing {@link BootstrapFragment} within the given {@link Environment}.
	 * 
	 * @param configuration
	 * @param environment
	 * @throws Exception
	 * @see BootstrapFragment#init(Environment)
	 */
	public void init(SnowOwlConfiguration configuration, Environment environment) throws Exception {
		for (BootstrapFragment fragment : extensions) {
			fragment.init(configuration, environment);
		}
	}

	/**
	 * Executes {@link BootstrapFragment#run(SnowOwlConfiguration, Environment, IProgressMonitor)} methods.
	 * 
	 * @param environment
	 * @param monitor
	 * @throws Exception
	 * @see BootstrapFragment#run(Environment)
	 */
	public void run(SnowOwlConfiguration configuration, Environment environment, IProgressMonitor monitor) throws Exception {
		for (BootstrapFragment fragment : extensions) {
			fragment.run(configuration, environment, monitor);
		}
	}

	/**
	 * Executes {@link PreRunCapableBootstrapFragment#preRun(SnowOwlConfiguration, Environment)} methods in the currently registered
	 * {@link BootstrapFragment}s.
	 * 
	 * @param configuration
	 * @param environment
	 */
	public void preRun(SnowOwlConfiguration configuration, Environment environment) {
		for (BootstrapFragment fragment : extensions) {
			if (fragment instanceof PreRunCapableBootstrapFragment) {
				((PreRunCapableBootstrapFragment) fragment).preRun(configuration, environment);
			}
		}
	}

	/**
	 * @return {@link BootstrapFragment} extensions.
	 */
	public Collection<BootstrapFragment> getExtensions() {
		return extensions;
	}

	/**
	 * Computes a fieldName to Configuration class {@link Map} and returns it based on the currently configured and registered {@link ModuleConfig}
	 * annotations.
	 * 
	 * @return
	 * @since 3.4
	 */
	public Map<String, Class<?>> getModuleConfigurations() {
		final Map<String, Class<?>> moduleConfigMap = newHashMap();
		for (BootstrapFragment fragment : getExtensions()) {
			final Class<? extends BootstrapFragment> fragmentClass = fragment.getClass();
			if (fragmentClass.isAnnotationPresent(ModuleConfig.class)) {
				processModuleConfig(moduleConfigMap, fragmentClass.getAnnotation(ModuleConfig.class));
			}
			if (fragmentClass.isAnnotationPresent(ModuleConfigs.class)) {
				processModuleConfig(moduleConfigMap, fragmentClass.getAnnotation(ModuleConfigs.class));
			}
		}
		return moduleConfigMap;
	}

	private void processModuleConfig(Map<String, Class<?>> moduleConfigMap, ModuleConfig moduleConfig) {
		moduleConfigMap.put(moduleConfig.fieldName(), moduleConfig.type());
	}

	private void processModuleConfig(Map<String, Class<?>> moduleConfigMap, ModuleConfigs moduleConfigs) {
		for (ModuleConfig moduleConfig : moduleConfigs.value()) {
			processModuleConfig(moduleConfigMap, moduleConfig);
		}
	}

}