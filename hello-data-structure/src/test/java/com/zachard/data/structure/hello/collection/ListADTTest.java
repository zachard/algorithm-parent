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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <code>数据结构与算法分析 Java语言描述</code> 第三章: 表、栈和队列
 * {@link List} <code>ADT</code>    --  为{@link List}接口定义操作测试
 * <pre>
 * </pre>
 *
 * @author zachard
 * @version 1.0.0
 */
public class ListADTTest {
    
    private static Logger logger = LoggerFactory.getLogger(ListADTTest.class);
    
    private static final int ONE_HUNDRED = 100;
    private static final int TEN_THOUSAND = 10000;
    private static final int ONE_MILLION = 1000000;
    
    /**
     * 通过将元素添加到列表最尾端来构建列表的方法测试
     * 包含{@link ArrayList}与{@link LinkedList}两种不同的实现测试
     */
    @Test
    public void makeListFromEndTest() {
        
       try {
           logger.info("测试用例开始运行, 线程休眠3s...");
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           logger.error("线程被中断, 异常为: {}", e);
       }
       
       List<Integer> arrList = new ArrayList<>();
       
       // 构建一个长度为100的ArrayList
       arrList.clear();
       long start = System.currentTimeMillis();
       ListADT.makeListFromEnd(arrList, ONE_HUNDRED);
       long end = System.currentTimeMillis();
       logger.info("以向列表结尾添加元素的方式构建一个长度为100的数组列表耗时为: {}", end - start);
       
       // 构建一个长度为10000的ArrayList
       arrList.clear();
       start = System.currentTimeMillis();
       ListADT.makeListFromEnd(arrList, TEN_THOUSAND);
       end = System.currentTimeMillis();
       logger.info("以向列表结尾添加元素的方式构建一个长度为10000的数组列表耗时为: {}", end - start);
       
       // 构建一个长度为100000000的ArrayList
       arrList.clear();
       start = System.currentTimeMillis();
       ListADT.makeListFromEnd(arrList, ONE_MILLION);
       end = System.currentTimeMillis();
       logger.info("以向列表结尾添加元素的方式构建一个长度为1000000的数组列表耗时为: {}", end - start);
       
       List<Integer> linkedList = new LinkedList<>();
       
       // 构建一个长度为100的LinkedList
       linkedList.clear();
       start = System.currentTimeMillis();
       ListADT.makeListFromEnd(linkedList, ONE_HUNDRED);
       end = System.currentTimeMillis();
       logger.info("以向列表结尾添加元素的方式构建一个长度为100的双链表耗时为: {}", end - start);
       
       // 构建一个长度为10000的LinkedList
       linkedList.clear();
       start = System.currentTimeMillis();
       ListADT.makeListFromEnd(linkedList, TEN_THOUSAND);
       end = System.currentTimeMillis();
       logger.info("以向列表结尾添加元素的方式构建一个长度为10000的双链表耗时为: {}", end - start);
       
       // 构建一个长度为1000000的LinkedList
       linkedList.clear();
       start = System.currentTimeMillis();
       ListADT.makeListFromEnd(linkedList, ONE_MILLION);
       end = System.currentTimeMillis();
       logger.info("以向列表结尾添加元素的方式构建一个长度为1000000的双链表耗时为: {}", end - start);
    }
    
    /**
     * 将元素添加到列表最前端的方法来构建列表测试
     * 包含{@link ArrayList}和{@link LinkedList}两种不同的列表测试
     */
    @Test
    public void makeListFromStartTest() {
        
        try {
            logger.info("测试用例开始运行, 线程休眠3s...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            logger.error("线程被中断, 异常为: {}", e);
        }
        
        List<Integer> arrList = new ArrayList<>();
        
        // 构建一个长度为100的ArrayList
        arrList.clear();
        long start = System.currentTimeMillis();
        ListADT.makeListFromStart(arrList, ONE_HUNDRED);
        long end = System.currentTimeMillis();
        logger.info("以向列表前端添加元素的方式构建一个长度为100的数组列表耗时为: {}", end - start);
        
        // 构建一个长度为10000的ArrayList
        arrList.clear();
        start = System.currentTimeMillis();
        ListADT.makeListFromStart(arrList, TEN_THOUSAND);
        end = System.currentTimeMillis();
        logger.info("以向列表前端添加元素的方式构建一个长度为10000的数组列表耗时为: {}", end - start);
        
        // 构建一个长度为100000000的ArrayList
        arrList.clear();
        start = System.currentTimeMillis();
        ListADT.makeListFromStart(arrList, ONE_MILLION);
        end = System.currentTimeMillis();
        logger.info("以向列表前端添加元素的方式构建一个长度为1000000的数组列表耗时为: {}", end - start);
        
        List<Integer> linkedList = new LinkedList<>();
        
        // 构建一个长度为100的LinkedList
        linkedList.clear();
        start = System.currentTimeMillis();
        ListADT.makeListFromStart(linkedList, ONE_HUNDRED);
        end = System.currentTimeMillis();
        logger.info("以向列表前端添加元素的方式构建一个长度为100的双链表耗时为: {}", end - start);
        
        // 构建一个长度为10000的LinkedList
        linkedList.clear();
        start = System.currentTimeMillis();
        ListADT.makeListFromStart(linkedList, TEN_THOUSAND);
        end = System.currentTimeMillis();
        logger.info("以向列表前端添加元素的方式构建一个长度为10000的双链表耗时为: {}", end - start);
        
        // 构建一个长度为1000000的LinkedList
        linkedList.clear();
        start = System.currentTimeMillis();
        ListADT.makeListFromStart(linkedList, ONE_MILLION);
        end = System.currentTimeMillis();
        logger.info("以向列表前端添加元素的方式构建一个长度为1000000的双链表耗时为: {}", end - start);
    }
    
    /**
     * 计算列表获取最后一个元素所需花费的时间
     * 包含对{@link ArrayList}和{@link LinkedList}的测试
     */
    @Test
    public void getTest() {
        
        try {
            logger.info("测试用例开始运行, 线程休眠3s...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            logger.error("线程被中断, 异常为: {}", e);
        }
        
        List<Integer> arrList = new ArrayList<>();
        
        // 计算获取长度为100的ArrayList中的最后一个元素所需的时间
        arrList.clear();
        ListADT.makeListFromEnd(arrList, ONE_HUNDRED);
        long start = System.currentTimeMillis();
        Integer data = arrList.get(arrList.size() - 1);
        long end = System.currentTimeMillis();
        logger.info("获取一个长度为100的数组列表中最后一个元素花费的时间为: {}, 最后一个元素值为: {}", 
                end - start, data);
        
        // 计算获取长度为10000的ArrayList中最后一个元素所需的时间
        arrList.clear();
        ListADT.makeListFromEnd(arrList, TEN_THOUSAND);
        start = System.currentTimeMillis();
        data = arrList.get(arrList.size() - 1);
        end = System.currentTimeMillis();
        logger.info("获取一个长度为10000的数组列表中最后一个元素花费的时间为: {}, 最后一个元素值为: {}", 
                end - start, data);
        
        // 计算获取长度为1000000的ArrayList中最后一个元素所需的时间
        arrList.clear();
        ListADT.makeListFromEnd(arrList, ONE_MILLION);
        start = System.currentTimeMillis();
        data = arrList.get(arrList.size() - 1);
        end = System.currentTimeMillis();
        logger.info("获取一个长度为1000000的数组列表中最后一个元素花费的时间为: {}, 最后一个元素值为: {}", 
                end - start, data);
        
        List<Integer> linkedList = new LinkedList<>();
        
        // 计算获取长度为100的LinkedList中最后一个元素所需的时间
        linkedList.clear();
        ListADT.makeListFromEnd(linkedList, ONE_HUNDRED);
        start = System.currentTimeMillis();
        data = linkedList.get(linkedList.size() - 1);
        end = System.currentTimeMillis();
        logger.info("获取一个长度为100的双链表列表中最后一个元素花费的时间为: {}, 最后一个元素值为: {}", 
                end - start, data);
        
        // 计算获取长度为10000的LinkedList中最后一个元素所需时间
        linkedList.clear();
        ListADT.makeListFromEnd(linkedList, TEN_THOUSAND);
        start = System.currentTimeMillis();
        data = linkedList.get(linkedList.size() - 1);
        end = System.currentTimeMillis();
        logger.info("获取一个长度为10000的双链表列表中最后一个元素花费的时间为: {}, 最后一个元素值为: {}", 
                end - start, data);
        
        // 计算获取长度为1000000的LinkedList中最后一个元素所需时间
        linkedList.clear();
        ListADT.makeListFromEnd(linkedList, ONE_MILLION);
        data = linkedList.get(linkedList.size() - 1);
        end = System.currentTimeMillis();
        logger.info("获取一个长度为1000000的双链表列表中最后一个元素花费的时间为: {}, 最后一个元素值为: {}", 
                end - start, data);
    }

}
