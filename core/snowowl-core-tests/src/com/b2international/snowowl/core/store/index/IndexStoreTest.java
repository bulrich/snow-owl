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

import org.junit.Rule;

import com.b2international.snowowl.core.store.BaseStoreTest;
import com.b2international.snowowl.core.store.Store;
import com.b2international.snowowl.core.tests.ESLocalNodeRule;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @since 4.1
 */
public class IndexStoreTest extends BaseStoreTest {

	@Rule
	public ESLocalNodeRule es = new ESLocalNodeRule(); 
	
	@Override
	protected <T> Store<T> createStore(Class<T> type) {
		final ObjectMapper mapper = new ObjectMapper();
		final Index index = new DefaultIndex(es.client(), getClass().getSimpleName().toLowerCase(), Mappings.of(mapper, type));
		final IndexAdmin admin = index.admin();
		admin.delete();
		admin.create();
		return new IndexStore<>(index, type);
	}
	
}
