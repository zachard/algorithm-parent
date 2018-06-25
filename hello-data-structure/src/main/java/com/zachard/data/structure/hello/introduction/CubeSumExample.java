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

/**
 * <code>数据结构与算法分析 Java语言描述</code> 第二章: 算法分析
 * 运行时间计算    --  计算正整数一段范围内的立方之和
 * <pre>
 * </pre>
 *
 * @author zachard
 * @version 1.0.0
 */
public class CubeSumExample {
	
	/**
	 * 计算一段正整数区间内的立方之和
	 * 
	 * @param start  起始正整数
	 * @param end    结束正整数
	 * @return       各个正整数的立方之和
	 */
	public static long sum(long start, long end) {
		if (start > end) {
			throw new IllegalArgumentException("起始参数不能大于结束参数");
		}
		
		long cubeSum = 0;
		
		for (long i = start; i <= end; i++) {
			cubeSum = cubeSum + i * i * i;
		}
		
		return cubeSum;
	}

}
