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
 * <code>数据结构与算法分析 Java语言描述</code> 第二章: 算法分析
 * 运行时间计算    --  计算正整数一段范围内的立方之和测试类
 * <pre>
 * </pre>
 *
 * @author zachard
 * @version 1.0.0
 */
public class CubeSumExampleTest {
	
	private static Logger logger = LoggerFactory.getLogger(CubeSumExampleTest.class);
	
	/**
	 * 计算一段正整数区间内的立方之和测试方法
	 */
	@Test
	public void sumTest() {
		long start = System.currentTimeMillis();
		long sum10 = CubeSumExample.sum(1, 10);
		long end = System.currentTimeMillis();
		logger.info("计算1~10内的正整数立方之和, 和为: {}, 耗时为: {}", sum10, end - start);
		
		start = System.currentTimeMillis();
		long sum100 = CubeSumExample.sum(1, 100);
		end = System.currentTimeMillis();
		logger.info("计算1~100内的正整数立方之和, 和为: {}, 耗时为: {}", sum100, end - start);
		
		start = System.currentTimeMillis();
		long sum10000 = CubeSumExample.sum(1, 10000);
		end = System.currentTimeMillis();
		logger.info("计算1~10000内的正整数立方之和, 和为: {}, 耗时为: {}", sum10000, end - start);
	}

}
