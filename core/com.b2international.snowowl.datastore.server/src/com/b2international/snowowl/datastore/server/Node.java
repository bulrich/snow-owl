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
package com.b2international.snowowl.datastore.server;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * Represents a node in a {@link Graph}.
 * 
 * @since 3.4
 */
public class Node {

	private final String id;
	private boolean visited;
	private List<Node> adjacents = Lists.newArrayList();

	public Node(final String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(final boolean visited) {
		this.visited = visited;
	}

	public List<Node> getAdjacents() {
		return adjacents;
	}

	public void addAdjacents(final List<Node> adjacents) {
		this.adjacents.addAll(adjacents);
	}

}