/*
 * Copyright 2011-2016 B2i Healthcare Pte Ltd, http://b2i.sg
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
package com.b2international.index.write;

import java.io.IOException;

import com.b2international.index.Index;

/**
 * Transactional write operation over a single {@link Index}.
 * 
 * @since 4.7
 * @param <T>
 *            - the type of object to return from this operation
 * @see Index#write(IndexWrite)
 */
public interface IndexWrite<T> {

	/**
	 * Execute this write operation.
	 * 
	 * @param index
	 *            - an access object to the underlying index, can be used to modify the index
	 * @return
	 * @throws IOException
	 */
	T execute(Writer index) throws IOException;

}