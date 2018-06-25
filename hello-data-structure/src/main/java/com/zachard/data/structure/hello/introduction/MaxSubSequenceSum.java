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
 * 运行时间计算    --  计算最大子序列之和
 * <pre>
 * </pre>
 *
 * @author zachard
 * @version 1.0.0
 */
public class MaxSubSequenceSum {
	
	/**
	 * 所有子序列的和都被计算, 并返回最大的子序列和
	 * 
	 * @param arr   整数数组
	 * @return      最大的子序列和
	 */
	public static int maxSubSum1(int[] arr) {
		int maxSum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				int thisSum = 0;
				
				for(int k = i; k <= j; k++) {
					thisSum = thisSum + arr[k];
				}
				
				if (thisSum > maxSum) {
					maxSum = thisSum;
				}
			}
		}
		
		return maxSum;
	}
	
	/**
	 * 两次循环实现求最大子序列和问题
	 * 
	 * @param arr   整数数组
	 * @return      最大子序列和
	 */
	public static int maxSubSum2(int[] arr) {
		int maxSum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int thisSum = 0;
			
			for(int j = i; j < arr.length; j++) {
				thisSum += arr[j];
				
				if (thisSum > maxSum) {
					maxSum = thisSum;
				}
			}
		}
		
		return maxSum;
	}
	
	/**
	 * 递归方式求解最大子序列和问题
	 * 
	 * @param arr   需要求解的序列
	 * @return      最大子序列和
	 */
	public static int maxSubSum3(int[] arr) {
		return maxSumRec(arr, 0, arr.length - 1);
	}
	
	/**
	 * 线性时间求解最大子序列和问题
	 * 
	 * @param arr    需要求解的序列
	 * @return       最大子序列和
	 */
	public static int maxSubSum4(int[] arr) {
		int maxSum = 0, thisSum = 0;
		
		for(int j = 0; j < arr.length; j++) {
			thisSum = thisSum + arr[j];
			
			if (thisSum > maxSum) {
				maxSum = thisSum;
			} else if (thisSum < 0) {
				thisSum = 0;
			}
		}
		
		return maxSum;
	}
	
	/**
	 * 对序列求解其最大子序列和的递归求解方法
	 * 
	 * @param arr     序列数组
	 * @param left    左下标
	 * @param right   右下标
	 * @return        最大子序列和
	 */
	private static int maxSumRec(int[] arr, int left, int right) {
		if (left == right) {
			// 处理基础情况: left==right表示只有一个元素, 该元素非负时它就是最大子序列, 否则返回0
			if (arr[left] > 0) {
				return arr[left];
			} else {
				return 0;
			}
		}
		
		// 计算左半部分和右半部分的最大子序列和
		int center = (left + right) / 2;
		int maxLeftSum = maxSumRec(arr, left, center);
		int maxRightSum = maxSumRec(arr, center + 1,  right);
		
		int maxLeftBorderSum = 0, leftBorderSum = 0;
		
		for(int i = center; i >= left; i--) {
			// 计算左半部分包含最后一个元素的最大子序列和
			leftBorderSum = leftBorderSum + arr[i];
			
			if (leftBorderSum > maxLeftBorderSum) {
				maxLeftBorderSum = leftBorderSum;
			}
		}
		
		int maxRightBorderSum = 0, rightBorderSum = 0;
		
		for (int i = center + 1; i <= right; i++) {
			// 计算右半部分包含第一个元素的最大子序列和
			rightBorderSum = rightBorderSum + arr[i];
			
			if (rightBorderSum > maxRightBorderSum) {
				maxRightBorderSum = rightBorderSum;
			}
		}
		
		return max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);
	}
	
	/**
	 * 求解三个正整数中最大的一个
	 * 
	 * @param a   正整数a
	 * @param b   正整数b
	 * @param c   正整数c
	 * @return    三个正整数中最大的一个
	 */
	private static int max3(int a, int b, int c) {
		return a > b ? (a > c ? a : c) : (b > c ? b : c);
	}
}
