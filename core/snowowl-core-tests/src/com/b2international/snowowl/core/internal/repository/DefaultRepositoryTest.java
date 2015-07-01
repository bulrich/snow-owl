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
package com.b2international.snowowl.core.internal.repository;

import static com.google.common.collect.Sets.newHashSet;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

import java.io.File;
import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.net4j.db.IDBAdapter;
import org.eclipse.net4j.db.h2.H2Adapter;
import org.junit.Before;
import org.junit.Test;

import person.PersonPackage;

import com.b2international.snowowl.core.exceptions.SnowOwlException;
import com.b2international.snowowl.core.repository.Repository;
import com.b2international.snowowl.core.repository.RepositorySession;
import com.b2international.snowowl.core.repository.config.RepositoryConfiguration;
import com.b2international.snowowl.core.repository.cp.ChangeProcessorFactory;
import com.b2international.snowowl.core.repository.cp.IEClassProvider;
import com.b2international.snowowl.core.terminology.Component;
import com.b2international.snowowl.core.tests.person.Person;



/**
 * @since 5.0
 */
public class DefaultRepositoryTest {

	private static final String USER = "user";
	private static final char[] PASS = new char[]{'p', 'a', 's', 's'};
	
	private static final String REPO_NAME = "person";
	private static final String REPO_NAME_2 = "Person Store";
	private static final String LOC = "target/store";

	private Collection<Class<? extends Component>> components = newHashSet();
	private Collection<EPackage> ePackages = newHashSet();
	private RepositoryConfiguration config;
	
	@Before
	public void givenRepositoryConfiguration() {
		config = new RepositoryConfiguration();
		// set location explicitly for tests
		config.getDatabaseConfiguration().setLocation(LOC);
		
		// manually set up h2 adapter instance
		IDBAdapter.REGISTRY.put("h2", new H2Adapter());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createRepositoryWithoutComponents() throws Exception {
		new DefaultRepository(REPO_NAME, components, ePackages, null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createRepositoryWithoutEPackages() throws Exception {
		components.add(Person.class);
		new DefaultRepository(REPO_NAME, components, ePackages, null);
	}
	
	@Test(expected = NullPointerException.class)
	public void createRepositoryWithoutConfig() throws Exception {
		components.add(Person.class);
		ePackages.add(PersonPackage.eINSTANCE);
		new DefaultRepository(REPO_NAME, components, ePackages, null);
	}
	
	@Test
	public void createValidRepository() throws Exception {
		final Repository repository = createPersonRepository();
		assertThat(repository.name()).isEqualTo(REPO_NAME);
	}

	@Test
	public void createAndActivateRepository_ShouldCreateAllRequiredStores() throws Exception {
		createPersonRepository().activate();
		assertThat(new File(LOC, REPO_NAME+".h2.db")).exists();
	}
	
	@Test
	public void createAndActivateRepository_ShouldConvertRepositoryNameToFilePathWithoutSpaces() throws Exception {
		createPersonRepository(REPO_NAME_2).activate();
		assertThat(new File(LOC, REPO_NAME_2.replaceAll(" ", "_").toLowerCase()+".h2.db")).exists();
	}
	
	@Test(expected = IllegalStateException.class)
	public void getSessionsOnInactiveRepository_ShouldThrowSnowOwlException() throws Exception {
		final Repository repository = createPersonRepository();
		repository.sessions();
	}
	
	@Test
	public void createAndActivateRepository_ShouldCreateBasicRepositoryServices() throws Exception {
		final Repository repository = createPersonRepository();
		repository.activate();
		assertNotNull(repository.branching());
		assertNotNull(repository.sessions());
	}
	
	@Test(expected = SnowOwlException.class)
	public void openSessionForUnknownUser_ShouldThrowException() throws Exception {
		final Repository repository = createPersonRepository();
		repository.activate();
		repository.sessions().open(USER, PASS);
	}
	
	@Test
	public void openSessionWithKnownUser_ShouldBeSuccessful() throws Exception {
		final Repository repository = createPersonRepository();
		repository.activate();
		// mocked app login
		((InternalRepository)repository).addUser(USER, PASS);
		final RepositorySession session = repository.sessions().open(USER, PASS);
		assertThat(repository.sessions().getSessions()).contains(session);
	}
	
	// TODO test automatic session close (1 sec wait then check that the session has been closed)
	
	private Repository createPersonRepository() {
		return createPersonRepository(REPO_NAME);
	}

	private Repository createPersonRepository(final String name) {
		components.add(Person.class);
		ePackages.add(PersonPackage.eINSTANCE);
		final InternalRepository repository = new DefaultRepository(name, components, ePackages, config);
		repository.setEClassProvider(mock(IEClassProvider.class));
		repository.addChangeProcessorFactory(mock(ChangeProcessorFactory.class));
		return repository;
	}
	
}
