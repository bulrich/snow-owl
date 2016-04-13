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
package com.b2international.collections;

import com.b2international.collections.list.FastUtilPrimitiveListFactory;
import com.b2international.collections.list.PrimitiveListFactory;
import com.b2international.collections.map.FastUtilPrimitiveMapFactory;
import com.b2international.collections.map.PrimitiveMapFactory;
import com.b2international.collections.set.FastUtilPrimitiveSetFactory;
import com.b2international.collections.set.PrimitiveSetFactory;

/**
 * @since 4.7
 */
public final class FastUtilPrimitiveCollections {

	private static final PrimitiveListFactory LISTS = new FastUtilPrimitiveListFactory();
	private static final PrimitiveSetFactory SETS = new FastUtilPrimitiveSetFactory();
	private static final PrimitiveMapFactory MAPS = new FastUtilPrimitiveMapFactory();

	public static PrimitiveListFactory lists() {
		return LISTS;
	}
	
	public static PrimitiveSetFactory sets() {
		return SETS;
	}
	
	public static PrimitiveMapFactory maps() {
		return MAPS;
	}
	
}
