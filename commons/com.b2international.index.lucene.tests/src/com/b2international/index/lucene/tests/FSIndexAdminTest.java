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
package com.b2international.index.lucene.tests;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import com.b2international.index.FSIndexAdmin;
import com.b2international.index.admin.IndexAdmin;

/**
 * @since 4.7
 */
public class FSIndexAdminTest {

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	private IndexAdmin admin;

	@Before
	public void givenIndexAdmin() {
		admin = new FSIndexAdmin(folder.getRoot(), UUID.randomUUID().toString());
	}
	
	@Test
	public void createIndex() throws Exception {
		assertFalse(admin.exists());
		admin.create();
		assertTrue(admin.exists());
	}
	
	@Test(expected = IllegalStateException.class)
	public void createIndexTwice() throws Exception {
		createIndex();
		admin.create();
	}

	@Test
	public void deleteIndex() throws Exception {
		createIndex();
		admin.delete();
		assertFalse(admin.exists());
	}
	
}