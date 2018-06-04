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
 * 运行时间计算    --  运行时间中的对数(折半查找)
 * <pre>
 * </pre>
 *
 * @author zachard
 * @version 1.0.0
 */
public class BinarySearch {
	
	/**
	 * 折半查找未找到标识
	 */
	private static int NOT_FOUND = -1;
	
	/**
	 * 折半查找数据算法
	 * 
	 * @param arr  被查找的数组
	 * @param a    需要查找的元素
	 * @return     {@code -1}表示未找到, 其他为元素在数组中下标
	 */
	public static int binarySearch(int[] arr, int a) {
		int low = 0, high = arr.length - 1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if (arr[mid] < a) {
				low = mid + 1;
			} else if (arr[mid] > a) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		
		return NOT_FOUND;
	}

}
