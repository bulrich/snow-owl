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
package com.b2international.snowowl.core.store.index;

import org.elasticsearch.client.AdminClient;

/**
 * Administration interface managing an elasticsearch index.
 * 
 * @since 5.0
 */
public interface IndexAdmin {

	/**
	 * Returns <code>true</code> if the index already exists, otherwise returns <code>false</code>.
	 */
	boolean exists();

	/**
	 * Creates the index if and only if does not exist yet, otherwise this method is no-op. Configure the defined {@link #mappings()} as well.
	 */
	void create();

	/**
	 * Deletes the entire index with its data if and only if does exist, otherwise this method is no-op.
	 */
	void delete();

	/**
	 * Clears a type and all its associated data from the index.
	 * 
	 * @param type
	 *            - the type to remove completely from the index
	 */
	void clear(String type);

	/**
	 * Returns all defined mappings.
	 * 
	 * @return
	 */
	Mappings mappings();

	/**
	 * Returns the index name this {@link IndexAdmin} is responsible for.
	 * 
	 * @return
	 */
	String name();

	/**
	 * Returns the admin client to directly work with elasticsearch. TODO move this to internal or remove if possible
	 * 
	 * @return
	 */
	AdminClient client();

}
