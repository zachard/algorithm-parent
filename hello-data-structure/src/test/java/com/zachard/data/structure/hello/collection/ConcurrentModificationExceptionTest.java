/*
 *  Copyright 2015-2018 zachard, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.zachard.data.structure.hello.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 集合并发更改异常测试
 * <pre>
 * </pre>
 *
 * @author zachard
 * @version 1.0.0
 */
public class ConcurrentModificationExceptionTest {
	
	private static Logger logger = LoggerFactory.getLogger(ConcurrentModificationExceptionTest.class);
	
	/**
	 * 需要去除的人名
	 */
	public static final String EXCLUDE_NAME = "David";
	
	/**
	 * 人名列表
	 */
	public static final List<String> NAME_LIST;
	
	/**
	 * 初始化数据
	 */
	static {
		NAME_LIST = new ArrayList<>();
		NAME_LIST.add("Amy");
		NAME_LIST.add("Bob");
		NAME_LIST.add("Cary");
		NAME_LIST.add("David");
	}
	
	/**
	 * {@link Iterator#remove()}删除测试
	 */
	@Test
	public void iteratorRemoveTest() {
		Iterator<String> iterator = NAME_LIST.iterator();
		
		while (iterator.hasNext()) {
			String name = iterator.next();
			
			if (Objects.equals(EXCLUDE_NAME, name)) {
				iterator.remove();
				logger.info("被删除的姓名为: {}", name);
			}
		}
	} 
	
	/**
	 * {@link Collection#remove(Object)}方法测试
	 */
	@Test
	public void collectionRemoveTest() {
		Iterator<String> iterator = NAME_LIST.iterator();
		
		while (iterator.hasNext()) {
			String name = iterator.next();
			
			if (Objects.equals(EXCLUDE_NAME, name)) {
				NAME_LIST.remove(name);
				logger.info("被删除的姓名为: {}", name);
			}
		}
	} 
	
	/**
	 * 删除对应的姓名方法测试
	 */
	@Test
	public void removeTest() {
		for (String name : NAME_LIST) {
			if (Objects.equals(EXCLUDE_NAME, name)) {
				NAME_LIST.remove(name);
				logger.info("被删除的姓名为: {}", name);
			}
		}
	}

}
