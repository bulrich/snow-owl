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
package com.b2international.snowowl.core.store.index.tx;

import com.b2international.snowowl.core.terminology.Component;

/**
 * Transaction working on top of a {@link TransactionalIndex}.
 * 
 * @since 5.0
 */
public interface IndexTransaction {
	
	void add(long storageKey, Component object);
	
	// TODO do we need the type???
	void delete(long storageKey, String type);
	
	void commit(String commitMessage);
	
}
