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
 * <code>数据结构与算法分析 Java语言描述</code> 第一章: 引论
 * 递归简论    --  一个正确和错误的递归示例
 * <pre>
 * </pre>
 *
 * @author zachard
 * @version 1.0.0
 */
public class RecursiveSimpleExample {
	
	/**
	 * 一个正确的递归示例
	 * 
	 * @param x  参数, 必须大于等于0
	 * @return
	 */
	public static int good(int x) {
		
		if (x < 0) {
			throw new IllegalArgumentException("参数必须大于等于0");
		}
		
		if (x == 0) {
			return 0;
		}
		
		return 2 * good(x - 1) + x * x; 
	}
	
	/**
	 * 一个错误的递归示例
	 * 
	 * @param x  参数, 必须大于等于0
	 * @return
	 */
	public static int bad(int x) {
		
		if (x < 0) {
			throw new IllegalArgumentException("参数必须大于等于0");
		}
		
		if (x == 0) {
			return 0;
		}
		
		return bad(x / 3 + 1) + x - 1;
	}

}
