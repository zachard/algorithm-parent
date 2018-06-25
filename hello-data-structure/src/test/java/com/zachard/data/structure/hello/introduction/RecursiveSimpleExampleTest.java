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

package com.zachard.data.structure.hello.introduction;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <code>数据结构与算法分析 Java语言描述</code> 第一章: 引论
 * 递归简论    --  一个正确和错误的递归示例测试
 * <pre>
 * </pre>
 *
 * @author zachard
 * @version 1.0.0
 */
public class RecursiveSimpleExampleTest {
	
	private static Logger logger = LoggerFactory.getLogger(RecursiveSimpleExampleTest.class);
	
	/**
	 * 一个正确的递归示例测试
	 */
	@Test(expected = Exception.class)
	public void goodTest() {
		logger.info("基础情况返回值为: {}", RecursiveSimpleExample.good(0));
		logger.info("不断推进的递归结果: {}", RecursiveSimpleExample.good(10));
		logger.info("不符合方法参数应抛出异常: {}", RecursiveSimpleExample.good(-3));
	}
	
	/**
	 * 一个错误的递归示例测试
	 */
	@Test
	public void badTest() {
		logger.info("基础情况的返回值为: {}", RecursiveSimpleExample.bad(0));
		logger.info("不断推进的递归结果为: {}", RecursiveSimpleExample.bad(10));
		logger.info("不符合方法参数应抛出异常: {}", RecursiveSimpleExample.bad(-4));
	} 

}
