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
package com.b2international.snowowl.core.store.query;

import static com.google.common.base.Preconditions.checkNotNull;

import com.b2international.snowowl.core.store.Searchable;
import com.b2international.snowowl.core.store.query.Query.AfterSelectBuilder;
import com.b2international.snowowl.core.store.query.Query.AfterWhereBuilder;
import com.b2international.snowowl.core.store.query.Query.QueryBuilder;
import com.b2international.snowowl.core.store.query.Query.SearchContextBuilder;
import com.b2international.snowowl.core.store.query.req.SearchExecutor;

/**
 * @since 5.0
 */
public class DefaultQueryBuilder implements QueryBuilder, AfterSelectBuilder, SearchContextBuilder {

	private static final int DEFAULT_LIMIT = Integer.MAX_VALUE;

	private int offset = 0;
	private int limit = DEFAULT_LIMIT;
	private Select select;
	private Expression where;
	private SortBy sortBy = SortBy.NONE;
	private SearchExecutor executor;

	private Searchable searchable;

	protected DefaultQueryBuilder(Searchable searchable) {
		this.searchable = checkNotNull(searchable, "Searchable may not be null");
	}

	public int getLimit() {
		return limit;
	}
	
	public int getOffset() {
		return offset;
	}
	
	public Select getSelect() {
		return select;
	}
	
	public SortBy getSortBy() {
		return sortBy;
	}
	
	public Expression getWhere() {
		return where;
	}
	
	@Override
	public AfterWhereBuilder offset(int offset) {
		this.offset = offset;
		return this;
	}

	@Override
	public AfterWhereBuilder limit(int limit) {
		this.limit = limit;
		return this;
	}

	@Override
	public AfterSelectBuilder select(Select select) {
		this.select = select;
		return this;
	}
	
	@Override
	public AfterSelectBuilder selectAll() {
		return select(Select.all());
	}

	@Override
	public AfterWhereBuilder where(Expression expression) {
		this.where = expression;
		return this;
	}

	@Override
	public AfterWhereBuilder sortBy(SortBy sortBy) {
		this.sortBy = sortBy;
		return this;
	}

	@Override
	public <T> Iterable<T> search(Class<T> type) {
		return searchable.search(this, type);
	}
	
	@Override
	public SearchContextBuilder executeWith(SearchExecutor executor) {
		this.executor = executor;
		return this;
	}
	
	@Override
	public SearchExecutor executor() {
		return executor;
	}
	
	protected Searchable getSearchable() {
		return searchable;
	}
	
	@Override
	public Query build() {
		Query query = new Query();
		query.setSelect(select);
		query.setWhere(where);
		query.setLimit(limit);
		query.setOffset(offset);
		query.setSortBy(sortBy);
		return query;
	}
}
