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
 * 运行时间计算    --  运行时间中的对数(欧几里得算法)
 * <pre>
 * </pre>
 *
 * @author zachard
 * @version 1.0.0
 */
public class EuclidAlgorithms {
	
	/**
	 * 欧几里得算法求最大公约数
	 * 
	 * @param m  数一
	 * @param n  数二
	 * @return   最大公约数
	 */
	public static long gcd(long m, long n) {
		
		while (n != 0) {
			long rem = m % n;
			m = n;
			n = rem;
		}
		
		return m;
	}

}
