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

import java.util.List;

/**
 * <code>数据结构与算法分析 Java语言描述</code> 第三章: 表、栈和队列
 * {@link List} <code>ADT</code>    --  为{@link List}接口定义操作
 * <pre>
 * </pre>
 *
 * @author zachard
 * @version 1.0.0
 */
public class ListADT {
    
    /**
     * 通过将元素添加到结尾的方式构建一个列表
     * 
     * @param list   需要构建的列表
     * @param size   需要构建列表的长度
     */
    public static void makeListFromEnd(List<Integer> list, int size) {
//        list.clear();
        
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
    }
    
    /**
     * 通过将元素添加到列表的最前端的方式构建一个列表
     * 
     * @param list   需要构建的列表
     * @param size   需要构建列表的长度
     */
    public static void makeListFromStart(List<Integer> list, int size) {
//        list.clear();
        
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
    }
    
    /**
     * 计算一个列表的和
     * 
     * @param list    需要计算和的列表
     * @return        列表中所有元素的和
     */
    public static int sum(List<Integer> list) {
        int total = 0;
        
        for (int i = 0; i < list.size(); i++) {
            total = total + list.get(i);
        }
        
        return total;
    }
    
    /**
     * 通过先用{@link List#get(int)}方式获取元素, 判断是否为偶数
     * 然后调用{@link List#remove(int)}移除元素
     * 
     * @param list   需要删除偶数元素的列表
     */
    public static void removeEvensByGet(List<Integer> list) {
        int i = 0;
        
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }

}
