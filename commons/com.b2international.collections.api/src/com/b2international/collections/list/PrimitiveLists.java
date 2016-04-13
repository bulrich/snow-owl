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
package com.b2international.collections.list;

import com.b2international.collections.ByteCollection;
import com.b2international.collections.LongCollection;

/**
 * @since 4.7
 */
public interface PrimitiveLists {

	ByteList newByteArrayList(byte[] source);

	ByteList newByteArrayList(ByteCollection source);

	ByteList newByteArrayList(int expectedSize);
	
	IntList newIntArrayList();

	IntList newIntArrayList(int[] source);
	
	LongList newLongArrayList();

	LongList newLongArrayList(int expectedSize);

	LongList newLongArrayList(long[] source);

	LongList newLongArrayList(LongCollection source);

	IntList newUnmodifiableIntList(IntList source);
	
	IntDeque newIntArrayDeque(int[] source);

	LongDeque newLongArrayDeque();
	
}