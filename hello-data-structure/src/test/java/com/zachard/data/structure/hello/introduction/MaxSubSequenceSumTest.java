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

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <code>数据结构与算法分析 Java语言描述</code> 第二章: 算法分析
 * 运行时间计算    --  计算最大子序列之和测试
 * <pre>
 * </pre>
 *
 * @author zachard
 * @version 1.0.0
 */
public class MaxSubSequenceSumTest {
	
	private static Logger logger = LoggerFactory.getLogger(MaxSubSequenceSumTest.class);
	
	private static int[] arr10 = {8, -9, 9, 5, 10, -5, -4, 4, 7, 1};
	private static int[] arr100 = {};
	private static int[] arr1000 = {};
	private static int[] arr10000 = {};
	
	static {
		logger.info("初始化数据开始...");
		
		for (int i = 0; i < 10; i++) {
			// 初始化100个元素的数组
			arr100 = ArrayUtils.addAll(arr100, arr10);
		}
		
		for (int i = 0; i < 10; i++) {
			// 初始化1000个元素的数组
			arr1000 = ArrayUtils.addAll(arr1000, arr100);
		}
		
		for (int i = 0; i < 10; i++) {
			// 初始化10000个元素的数组
			arr10000 = ArrayUtils.addAll(arr10000, arr1000);
		}
		
		logger.info("初始化数据结束...");
	}
	
	/**
	 * 最大子序列和问题求解不同算法及数据量耗时测试
	 */
	@Test
	public void maxSubSumTest() {
		long start = System.currentTimeMillis();
		int result = MaxSubSequenceSum.maxSubSum1(arr10);
		long end = System.currentTimeMillis();
		logger.info("maxSubSum1求数组长度为10最大子序列问题结果: {}, 耗时: {}", result, (end - start));
		
		start = System.currentTimeMillis();
		result = MaxSubSequenceSum.maxSubSum2(arr10);
		end = System.currentTimeMillis();
		logger.info("maxSubSum2求数组长度为10最大子序列问题结果: {}, 耗时: {}", result, (end - start));
		
		start = System.currentTimeMillis();
		result = MaxSubSequenceSum.maxSubSum3(arr10);
		end = System.currentTimeMillis();
		logger.info("maxSubSum3求数组长度为10最大子序列问题结果: {}, 耗时: {}", result, (end - start));
		
		start = System.currentTimeMillis();
		result = MaxSubSequenceSum.maxSubSum4(arr10);
		end = System.currentTimeMillis();
		logger.info("maxSubSum4求数组长度为10最大子序列问题结果: {}, 耗时: {}", result, (end - start));
		
		System.out.println();
		
		start = System.currentTimeMillis();
		result = MaxSubSequenceSum.maxSubSum1(arr100);
		end = System.currentTimeMillis();
		logger.info("maxSubSum1求数组长度为100最大子序列问题结果: {}, 耗时: {}", result, (end - start));
		
		start = System.currentTimeMillis();
		result = MaxSubSequenceSum.maxSubSum2(arr100);
		end = System.currentTimeMillis();
		logger.info("maxSubSum2求数组长度为100最大子序列问题结果: {}, 耗时: {}", result, (end - start));
		
		start = System.currentTimeMillis();
		result = MaxSubSequenceSum.maxSubSum3(arr100);
		end = System.currentTimeMillis();
		logger.info("maxSubSum3求数组长度为100最大子序列问题结果: {}, 耗时: {}", result, (end - start));
		
		start = System.currentTimeMillis();
		result = MaxSubSequenceSum.maxSubSum4(arr100);
		end = System.currentTimeMillis();
		logger.info("maxSubSum4求数组长度为100最大子序列问题结果: {}, 耗时: {}", result, (end - start));
		
		System.out.println();
		
		start = System.currentTimeMillis();
		result = MaxSubSequenceSum.maxSubSum1(arr1000);
		end = System.currentTimeMillis();
		logger.info("maxSubSum1求数组长度为1000最大子序列问题结果: {}, 耗时: {}", result, (end - start));
		
		start = System.currentTimeMillis();
		result = MaxSubSequenceSum.maxSubSum2(arr1000);
		end = System.currentTimeMillis();
		logger.info("maxSubSum2求数组长度为1000最大子序列问题结果: {}, 耗时: {}", result, (end - start));
		
		start = System.currentTimeMillis();
		result = MaxSubSequenceSum.maxSubSum3(arr1000);
		end = System.currentTimeMillis();
		logger.info("maxSubSum3求数组长度为1000最大子序列问题结果: {}, 耗时: {}", result, (end - start));
		
		start = System.currentTimeMillis();
		result = MaxSubSequenceSum.maxSubSum4(arr1000);
		end = System.currentTimeMillis();
		logger.info("maxSubSum4求数组长度为1000最大子序列问题结果: {}, 耗时: {}", result, (end - start));
		
		System.out.println();
		
		start = System.currentTimeMillis();
		result = MaxSubSequenceSum.maxSubSum1(arr10000);
		end = System.currentTimeMillis();
		logger.info("maxSubSum1求数组长度为10000最大子序列问题结果: {}, 耗时: {}", result, (end - start));
		
		start = System.currentTimeMillis();
		result = MaxSubSequenceSum.maxSubSum2(arr10000);
		end = System.currentTimeMillis();
		logger.info("maxSubSum2求数组长度为10000最大子序列问题结果: {}, 耗时: {}", result, (end - start));
		
		start = System.currentTimeMillis();
		result = MaxSubSequenceSum.maxSubSum3(arr10000);
		end = System.currentTimeMillis();
		logger.info("maxSubSum3求数组长度为10000最大子序列问题结果: {}, 耗时: {}", result, (end - start));
		
		start = System.currentTimeMillis();
		result = MaxSubSequenceSum.maxSubSum4(arr10000);
		end = System.currentTimeMillis();
		logger.info("maxSubSum4求数组长度为10000最大子序列问题结果: {}, 耗时: {}", result, (end - start));
	}

}
