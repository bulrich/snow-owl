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
package com.b2international.snowowl.core.repository.config;

import java.util.Map;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.b2international.commons.db.JdbcUrl;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.google.common.net.HostAndPort;

/**
 * Repository configuration is the central place where database connection
 * parameters, repository settings can be configured and retrieved.
 * 
 * @since 3.4
 */
public class RepositoryConfiguration {
	
	public static final String DATASOURCE_PASS = "password";
	public static final String DATASOURCE_USER = "user";
	public static final String DATASOURCE_URL = "uRL";
	public static final String DATASOURCE_CLASS = "class";

	private boolean compressed = false;

	@NotEmpty
	private String host = "0.0.0.0";

	@Min(0)
	@Max(65535)
	private int port = 2036;

	@NotNull
	private DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration();
	
	@Min(0)
	private long indexTimeout = 4L * 60L;
	
	/**
	 * Returns whether the communication used by the persistance layer is done
	 * in a compressed way or not.
	 * 
	 * @return
	 */
	@JsonProperty
	public boolean isCompressed() {
		return compressed;
	}

	/**
	 * Set to enable compressed data transfer in the persistance layer.
	 * 
	 * @param compressed
	 */
	@JsonProperty
	public void setCompressed(boolean compressed) {
		this.compressed = compressed;
	}

	/**
	 * @return the host
	 */
	@JsonProperty
	public String getHost() {
		return host;
	}

	/**
	 * @return the port
	 */
	@JsonProperty
	public int getPort() {
		return port;
	}

	/**
	 * @param host
	 *            the host to set
	 */
	@JsonProperty
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * @param port
	 *            the port to set
	 */
	@JsonProperty
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * Returns the currently set {@link HostAndPort}.
	 * 
	 * @return
	 */
	public HostAndPort getHostAndPort() {
		return HostAndPort.fromParts(getHost(), getPort());
	}

	/**
	 * @return the timeout in minutes after an index service is closed if the
	 *         associated branch is left unattended (no queries are run against
	 *         it and/or no documents are updated). If the branch is promoted in
	 *         the meantime, the associated index directory will be removed on a
	 *         timeout as well.
	 */
	@JsonProperty
	public long getIndexTimeout() {
		return indexTimeout;
	}

	/**
	 * @param indexTimeout
	 *            the indexTimeout to set
	 */
	@JsonProperty
	public void setIndexTimeout(long indexTimeout) {
		this.indexTimeout = indexTimeout;
	}
	
	/**
	 * @return the databaseConfiguration
	 */
	@JsonProperty("database")
	public DatabaseConfiguration getDatabaseConfiguration() {
		return databaseConfiguration;
	}
	
	/**
	 * @param databaseConfiguration the databaseConfiguration to set
	 */
	@JsonProperty("database")
	public void setDatabaseConfiguration(DatabaseConfiguration databaseConfiguration) {
		this.databaseConfiguration = databaseConfiguration;
	}

	/**
	 * Constructs a JDBC type database URL from the current configuration
	 * parameters.
	 * 
	 * @return the JDBC URL of the database for the repository
	 */
	public JdbcUrl getDatabaseUrl() {
		String location = getDatabaseConfiguration().getLocation();
		if (!location.endsWith("/")) {
			location = location.concat("/");
		}
		return new JdbcUrl(getDatabaseConfiguration().getScheme(), location, getDatabaseConfiguration().getSettings());
	}
	
	/**
	 * Returns a property map for the given repository name.
	 * 
	 * @param repositoryName
	 * @return
	 */
	public Map<Object, Object> getDatasourceProperties(String repositoryName) {
		final ImmutableMap.Builder<Object, Object> properties = ImmutableMap.builder();
		properties.put(DATASOURCE_CLASS, getDatabaseConfiguration().getDatasourceClass());
		properties.put(DATASOURCE_URL, getDatabaseUrl().build(repositoryName)); // XXX: strange casing required by net4j's uncapitalizer method when inspecting setters!
		properties.put(DATASOURCE_USER, getDatabaseConfiguration().getUsername());
		properties.put(DATASOURCE_PASS, getDatabaseConfiguration().getPassword());
		return properties.build();
	}

}