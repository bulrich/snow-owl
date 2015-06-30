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
package com.b2international.snowowl.core;

import static com.google.common.base.Preconditions.checkState;

import java.io.File;
import java.util.Enumeration;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.LogManager;

import javax.validation.Validator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.net4j.util.lifecycle.LifecycleUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.b2international.commons.config.ConfigurationFactory;
import com.b2international.commons.config.FileConfigurationSourceProvider;
import com.b2international.snowowl.core.boot.Bootstrap;
import com.b2international.snowowl.core.boot.BootstrapFragment;
import com.b2international.snowowl.core.boot.Environment;
import com.b2international.snowowl.core.config.SnowOwlConfiguration;
import com.b2international.snowowl.hibernate.validator.ValidationUtil;
import com.google.common.base.Strings;

/**
 * @since 3.3
 */
public class SnowOwl {

	private static final String NEW_LINE = "\r\n"; //$NON-NLS-1$
	private static final String DEFAULT_CONFIGURATION_FILE_NAME = "snowowl_config"; //$NON-NLS-1$
	private static final String[] SUPPORTED_CONFIG_EXTENSIONS = new String[]{"yml", "yaml", "json"};
	private static final Logger LOG = LoggerFactory.getLogger(SnowOwl.class);

	private static AtomicReference<SnowOwl> SNOW_OWL = new AtomicReference<>();
	
	private AtomicBoolean running = new AtomicBoolean(false);
	private AtomicBoolean preRunCompleted = new AtomicBoolean(false);

	private Bootstrap bootstrap;
	private Environment environment;
	private SnowOwlConfiguration configuration;
	
	private SnowOwl() {}

	/**
	 * Returns the {@link Environment} of the Snow Owl Application.
	 * 
	 * @return
	 */
	public Environment env() {
		return environment;
	}

	/**
	 * Returns the global {@link SnowOwlConfiguration} of this
	 * {@link SnowOwl}.
	 * 
	 * @return
	 */
	public SnowOwlConfiguration getConfiguration() {
		return configuration;
	}

	/**
	 * Bootstraps the application with a default configuration.
	 * 
	 * @throws Exception
	 * @see {@link #bootstrap(String)}
	 */
	public void bootstrap() throws Exception {
		bootstrap(null);
	}

	/**
	 * Bootstraps the application to a minimum runnable form.
	 * 
	 * @param configPath
	 *            - the configuration file path to use
	 * @param fragments - additional {@link BootstrapFragment} instances to use during initialization
	 */
	public void bootstrap(String configPath, BootstrapFragment...fragments) throws Exception {
		if (!isRunning()) {
			LOG.info("Bootstrapping Snow Owl...");
			this.bootstrap = new Bootstrap(fragments);
			this.configuration = createConfiguration(bootstrap, configPath);
			this.environment = new Environment(bootstrap, configuration);
			logEnvironment();
			this.bootstrap.init(this.configuration, this.environment);
			// after init checks
//			try {
//				this.environment.service(IUserManager.class);
//			} catch (Exception e) {
//				throw new InitializationException("UserManager should be registered after the bootstrap process.");
//			}
		}
	}

	private SnowOwlConfiguration createConfiguration(Bootstrap bootstrap, String configPath) throws Exception {
		if (Strings.isNullOrEmpty(configPath)) {
			configPath = getDefaultConfigPath(bootstrap);
		}
		final Validator validator = ValidationUtil.getValidator();
		final ConfigurationFactory<SnowOwlConfiguration> factory = new ConfigurationFactory<SnowOwlConfiguration>(SnowOwlConfiguration.class, validator);
		factory.setAdditionalModules(bootstrap.getModuleConfigurations());
		return configPath != null ? factory.build(new FileConfigurationSourceProvider(), configPath) : factory.build();
	}
	
	private String getDefaultConfigPath(Bootstrap bootstrap) {
		for (String supportedExtension : SUPPORTED_CONFIG_EXTENSIONS) {
			final File configFile = new File(bootstrap.getInstallationDirectory(), String.format("%s.%s", DEFAULT_CONFIGURATION_FILE_NAME, supportedExtension));
			if (configFile.exists()) {
				return configFile.getAbsolutePath();
			}
		}
		return null;
	}

	private void logEnvironment() {
		LOG.info(String.format("Application installation directory: %s", this.environment.getInstallationDirectory()));
		LOG.info(String.format("Application configuration directory: %s", this.environment.getConfigDirectory()));
		LOG.info(String.format("Application data directory: %s", this.environment.getDataDirectory()));
		LOG.info(String.format("Application defaults directory: %s", this.environment.getDefaultsDirectory()));
	}

	/**
	 * Runs the Snow Owl application by performing all necessary initialization
	 * logic. Uses a <code>null</code> {@link PreRunRunnable} and a
	 * {@link NullProgressMonitor} instance.
	 * 
	 * @throws Exception
	 * @see {@link #run(IProgressMonitor)}
	 * @see #run(PreRunRunnable, IProgressMonitor)
	 */
	public void run() throws Exception {
		run(new NullProgressMonitor());
	}

	/**
	 * Runs the application without any {@link PreRunRunnable} and the given
	 * monitor.
	 * 
	 * @param monitor
	 * @throws Exception
	 * @see #run(PreRunRunnable, IProgressMonitor)
	 */
	public void run(IProgressMonitor monitor) throws Exception {
		run(null, monitor);
	}

	/**
	 * Runs the application by performing all necessary initialization logic
	 * like service registrations, etc.
	 * 
	 * @param preRunRunnable
	 *            - to execute logic between
	 *            {@link Bootstrap#preRun(SnowOwlConfiguration, Environment)}
	 *            and
	 *            {@link Bootstrap#run(SnowOwlConfiguration, Environment, IProgressMonitor)}
	 * @param monitor
	 *            - to monitor application startup
	 */
	public void run(PreRunRunnable preRunRunnable, IProgressMonitor monitor) throws Exception {
		if (!isRunning()) {
			checkState(bootstrap != null, "Bootstrap the application first");
			if (preRunCompleted.compareAndSet(false, true)) {
				this.bootstrap.preRun(configuration, environment);
			}
			if (preRunRunnable != null) {
				preRunRunnable.run();
			}
			LOG.info("Preparing to run Snow Owl...");
			this.bootstrap.run(configuration, environment, monitor);
//			checkApplicationState();
			running.set(true);
			LOG.info("Snow Owl successfully started.");
		} else {
			LOG.info("Snow Owl is already running.");
		}
	}

	/**
	 * Checks the current application state and throws exceptions if errors have
	 * been found.
	 * 
	 * @throws InitializationException
	 *             - on application init failures
	 */
//	private void checkApplicationState() throws InitializationException {
//		// check all registered services
//		final Collection<ServiceRegistryEntry<?>> failedServices = this.environment.services().checkStrictServices();
//		if (!failedServices.isEmpty()) {
//			final String errorMessage = serviceRegistryErrorMessage(failedServices);
//			throw new InitializationException(errorMessage);
//		}
//	}

//	private String serviceRegistryErrorMessage(Collection<ServiceRegistryEntry<?>> failedServices) {
//		final StringBuilder builder = new StringBuilder();
//		for (Iterator<ServiceRegistryEntry<?>> iter = failedServices.iterator(); iter.hasNext();) {
//			final ServiceRegistryEntry<?> next = iter.next();
//			builder.append("Missing implementation of service: " + next.getServiceInterface());
//			if (iter.hasNext()) {
//				builder.append(NEW_LINE);
//			}
//		}
//		return builder.toString();
//	}

	/**
	 * Shuts down the Snow Owl application by performing shut down logic.
	 */
	public void shutdown() {
		if (isRunning()) {
			LOG.info("Snow Owl is shutting down.");
//			this.environment.services().dispose();
			LifecycleUtil.deactivate(environment.container());
			running.set(false);
		}
	}

	/**
	 * Returns whether the Snow Owl application is ready to use or not.
	 * 
	 * @return
	 */
	public boolean isRunning() {
		return running.get();
	}

	/**
	 * {@link PreRunRunnable} to run additional logic before the run method is
	 * actually called.
	 * 
	 * @since 3.3
	 */
	public static interface PreRunRunnable {

		public void run() throws Exception;

	}

	/**
	 * Exception to indicate problems with application startup.
	 * 
	 * @since 3.3
	 */
	public static class InitializationException extends RuntimeException {

		private static final long serialVersionUID = 3313953055518425730L;

		public InitializationException(String message) {
			super(message);
		}
	}

	/*
	 * Setting all java loggers levels to SEVERE. This is done here to suppress
	 * the overwhelming INFO logs from the apache CXF stack.
	 */
	static {
		final Enumeration<String> loggerNames = LogManager.getLogManager().getLoggerNames();
		while (loggerNames.hasMoreElements()) {
			final String name = loggerNames.nextElement();
			final java.util.logging.Logger javaLogger = LogManager.getLogManager().getLogger(name);
			if (javaLogger != null) {
				javaLogger.setLevel(Level.SEVERE);
			}
		}
	}

	public static SnowOwl owl() {
		if (SNOW_OWL.compareAndSet(null, new SnowOwl())) {
			// TODO initialize app
		}
		return SNOW_OWL.get();
	}

}