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
package com.b2international.snowowl.core.internal.branch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.RETURNS_MOCKS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.eclipse.emf.cdo.common.branch.CDOBranch;
import org.eclipse.emf.cdo.common.util.CDOTimeProvider;
import org.eclipse.emf.cdo.server.IRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.b2international.snowowl.core.branch.Branch;
import com.b2international.snowowl.core.conflict.ICDOConflictProcessor;
import com.b2international.snowowl.core.internal.repository.InternalRepository;
import com.b2international.snowowl.core.store.mem.MemStore;

/**
 * @since 4.1
 */
@RunWith(MockitoJUnitRunner.class)
public class CDOBranchManagerTest {

	private CDOTimeProvider clock;
	
	private CDOBranchManagerImpl manager;
	private CDOMainBranchImpl main;
	private Branch branchA;
	
	@Before
	public void givenCDOBranchManager() {
		clock = new AtomicLongTimestampAuthority();
		final MockInternalCDOBranchManager cdoBranchManager = new MockInternalCDOBranchManager(clock);
		cdoBranchManager.initMainBranch(false, clock.getTimeStamp());
		
		final InternalRepository repository = mock(InternalRepository.class, RETURNS_MOCKS);
		final IRepository cdoRepository = mock(IRepository.class, RETURNS_MOCKS);
		when(repository.getCdoRepository()).thenReturn(cdoRepository);
		when(cdoRepository.getBranchManager()).thenReturn(cdoBranchManager);
		when(repository.getConflictProcessor()).thenReturn(mock(ICDOConflictProcessor.class));
		
		manager = new CDOBranchManagerImpl(repository, new MemStore<InternalBranch>(InternalBranch.class));
		main = (CDOMainBranchImpl) manager.getMainBranch();
	}
	
	@Test
	public void whenGettingMainBranch_ThenItShouldBeReturned_AndAssociatedWithItsCDOBranch() throws Exception {
		final CDOBranch cdoBranch = manager.getCDOBranch(main);
		assertEquals(main.path(), cdoBranch.getPathName());
	}
	
	@Test
	public void whenCreatingBranch_ThenItShouldBeCreated_AndACDOBranchShouldBeAssociatedWithIt() throws Exception {
		branchA = main.createChild("a");
		final CDOBranch cdoBranch = manager.getCDOBranch(branchA);
		assertEquals(branchA.path(), cdoBranch.getPathName());
	}
	
	@Test
	public void whenCreatingDeepBranch_ThenItShouldBeCreatedAndAssociatedWithCDOBranches() throws Exception {
		branchA = main.createChild("a");
		final Branch branchB = branchA.createChild("b");
		final CDOBranch cdoBranchA = manager.getCDOBranch(branchA);
		assertEquals(branchA.path(), cdoBranchA.getPathName());
		final CDOBranch cdoBranchB = manager.getCDOBranch(branchB);
		assertEquals(branchB.path(), cdoBranchB.getPathName());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void whenGettingCDOBranchOfDeletedBranch_ThenThrowException() throws Exception {
		whenCreatingBranch_ThenItShouldBeCreated_AndACDOBranchShouldBeAssociatedWithIt();
		final Branch deletedA = branchA.delete();
		manager.getCDOBranch(deletedA);
	}
	
	@Test
	public void whenRebasingChildBranchInForwardState_ThenManagerShouldReopenAssociatedCDOBranch() throws Exception {
		branchA = main.createChild("a");
		final CDOBranch cdoBranchA = manager.getCDOBranch(branchA);
		// commit and rebase
		manager.handleCommit(main, clock.getTimeStamp());
		final Branch rebasedBranchA = branchA.rebase("Rebase");
		final CDOBranch rebasedCdoBranchA = manager.getCDOBranch(rebasedBranchA);
		assertNotEquals(rebasedCdoBranchA.getID(), cdoBranchA.getID());
	}
	
}
