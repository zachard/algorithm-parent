/*
 *  Copyright 2015-2018 zachard, Inc.
 *
 *  This file is reference to the textbook and it's source code
 *  
 *     Algorithms, 4th edition by Robert Sedgewick and Kevin Wayne,
 *     Addison-Wesley Professional, 2011, ISBN 0-321-57351-X.
 *     http://algs4.cs.princeton.edu
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.zachard.algorithms.hello.search;

/**
 * {@link BinarySearch}类提供了一个用于对已排序后整数数组进行二分查找的静态方法
 * <p>
 *   <em>rank</em>操作的时间复杂度为对数, 是最坏的情况
 * </p>
 *
 * @author zachard
 * @version 1.0.0
 */
public class BinarySearch {
	
	/**
	 * 返回有序数组中指定值对应的数组下标
	 * 这个函数是不完善的, 因为当需要查找的元素在数组中重复存在
	 * 或是不存在时, 不能得出需要查找的元素的下标
	 * 
	 * @param key    需要在数组中查找的值
	 * @param array  整数数组, 数组中的元素必须升序排列
	 * @return       如果需要查找的值在数组中存在,则返回它在数组中的下标, 否则返回<tt>-1</tt>
	 */
	public static int rank(int key, int[] array) {
		int lo = 0;
		int hi = array.length - 1;
		
		while (lo <= hi) {
			// 获取数组中间节点元素下标
			int mid = lo + (hi - lo) / 2;
			
			if (key < array[mid]) {
				hi = mid - 1;
			} else if (key > array[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}

}
