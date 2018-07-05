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

}
