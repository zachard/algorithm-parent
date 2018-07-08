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
import java.util.Iterator;
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
    
    /**
     * 通过用{@link List#get(int)}获取元素, 判断是否为偶数
     * 并通过{@link List#remove(int)}移除偶数元素耗时测试
     */
    @Test
    public void removeEvensByGetTest() {
        
        try {
            logger.info("测试用例开始运行, 线程休眠3s...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            logger.error("线程被中断, 异常为: {}", e);
        }
        
        List<Integer> arrList = new ArrayList<>();
        
        // 计算长度为100的ArrayList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
        arrList.clear();
        ListADT.makeListFromEnd(arrList, ONE_HUNDRED);
        long start = System.currentTimeMillis();
        ListADT.removeEvensByGet(arrList);
        long end = System.currentTimeMillis();
        logger.info("将长度为100的数组列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
        
        // 计算长度为10000的ArrayList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
        arrList.clear();
        ListADT.makeListFromEnd(arrList, TEN_THOUSAND);
        start = System.currentTimeMillis();
        ListADT.removeEvensByGet(arrList);
        end = System.currentTimeMillis();
        logger.info("将长度为10000的数组列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
        
        // 计算长度为1000000的ArrayList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
        arrList.clear();
        ListADT.makeListFromEnd(arrList, ONE_MILLION);
        start = System.currentTimeMillis();
        ListADT.removeEvensByGet(arrList);
        end = System.currentTimeMillis();
        logger.info("将长度为1000000的数组列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
        
        List<Integer> linkedList = new LinkedList<>();
        
        // 计算长度为100的LinkedList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
        linkedList.clear();
        ListADT.makeListFromEnd(linkedList, ONE_HUNDRED);
        start = System.currentTimeMillis();
        ListADT.removeEvensByGet(linkedList);
        end = System.currentTimeMillis();
        logger.info("将长度为100的双链表列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
        
        // 计算长度为10000的LinkedList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
        linkedList.clear();
        ListADT.makeListFromEnd(linkedList, TEN_THOUSAND);
        start = System.currentTimeMillis();
        ListADT.removeEvensByGet(linkedList);
        end = System.currentTimeMillis();
        logger.info("将长度为10000的双链表列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
        
        // 计算长度为1000000的LinkedList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
        linkedList.clear();
        ListADT.makeListFromEnd(linkedList, ONE_MILLION);
        start = System.currentTimeMillis();
        ListADT.removeEvensByGet(linkedList);
        end = System.currentTimeMillis();
        logger.info("将长度为1000000的双链表列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
    }
    
    /**
     * 通过增强<code>for</code>循环遍历列表, 当为偶数时
     * 通过{@link List#remove(Object)}移除元素测试
     */
    @Test
    public void removeEvensByForTest() {
        try {
            logger.info("测试用例开始运行, 线程休眠3s...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            logger.error("线程被中断, 异常为: {}", e);
        }
        
//        List<Integer> arrList = new ArrayList<>();
        
        // 计算长度为100的ArrayList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
//        arrList.clear();
//        ListADT.makeListFromEnd(arrList, ONE_HUNDRED);
//        long start = System.currentTimeMillis();
//        ListADT.removeEvensByFor(arrList);
//        long end = System.currentTimeMillis();
//        logger.info("将长度为100的数组列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
//        
//        // 计算长度为10000的ArrayList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
//        arrList.clear();
//        ListADT.makeListFromEnd(arrList, TEN_THOUSAND);
//        start = System.currentTimeMillis();
//        ListADT.removeEvensByFor(arrList);
//        end = System.currentTimeMillis();
//        logger.info("将长度为10000的数组列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
//        
//        // 计算长度为1000000的ArrayList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
//        arrList.clear();
//        ListADT.makeListFromEnd(arrList, ONE_MILLION);
//        start = System.currentTimeMillis();
//        ListADT.removeEvensByFor(arrList);
//        end = System.currentTimeMillis();
//        logger.info("将长度为1000000的数组列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
//        
        List<Integer> linkedList = new LinkedList<>();
        
        // 计算长度为100的LinkedList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
        linkedList.clear();
        ListADT.makeListFromEnd(linkedList, ONE_HUNDRED);
        long start = System.currentTimeMillis();
        ListADT.removeEvensByFor(linkedList);
        long end = System.currentTimeMillis();
        logger.info("将长度为100的双链表列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
        
        // 计算长度为10000的LinkedList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
        linkedList.clear();
        ListADT.makeListFromEnd(linkedList, TEN_THOUSAND);
        start = System.currentTimeMillis();
        ListADT.removeEvensByFor(linkedList);
        end = System.currentTimeMillis();
        logger.info("将长度为10000的双链表列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
        
        // 计算长度为1000000的LinkedList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
        linkedList.clear();
        ListADT.makeListFromEnd(linkedList, ONE_MILLION);
        start = System.currentTimeMillis();
        ListADT.removeEvensByFor(linkedList);
        end = System.currentTimeMillis();
        logger.info("将长度为1000000的双链表列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
    }
    
    /**
     * 通过{@link Iterator}迭代器遍历列表, 当元素为偶数时, 
     * 通过{@link Iterator#remove()}删除列表元素测试
     */
    @Test
    public void removeEvensByIteratorTest() {
        
        try {
            logger.info("测试用例开始运行, 线程休眠3s...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            logger.error("线程被中断, 异常为: {}", e);
        }
        
        List<Integer> arrList = new ArrayList<>();
        
        // 计算长度为100的ArrayList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
        arrList.clear();
        ListADT.makeListFromEnd(arrList, ONE_HUNDRED);
        long start = System.currentTimeMillis();
        ListADT.removeEvensByIterator(arrList);
        long end = System.currentTimeMillis();
        logger.info("将长度为100的数组列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
        
        // 计算长度为10000的ArrayList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
        arrList.clear();
        ListADT.makeListFromEnd(arrList, TEN_THOUSAND);
        start = System.currentTimeMillis();
        ListADT.removeEvensByIterator(arrList);
        end = System.currentTimeMillis();
        logger.info("将长度为10000的数组列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
        
        // 计算长度为1000000的ArrayList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
        arrList.clear();
        ListADT.makeListFromEnd(arrList, ONE_MILLION);
        start = System.currentTimeMillis();
        ListADT.removeEvensByIterator(arrList);
        end = System.currentTimeMillis();
        logger.info("将长度为1000000的数组列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
        
        List<Integer> linkedList = new LinkedList<>();
        
        // 计算长度为100的LinkedList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
        linkedList.clear();
        ListADT.makeListFromEnd(linkedList, ONE_HUNDRED);
        start = System.currentTimeMillis();
        ListADT.removeEvensByIterator(linkedList);
        end = System.currentTimeMillis();
        logger.info("将长度为100的双链表列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
        
        // 计算长度为10000的LinkedList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
        linkedList.clear();
        ListADT.makeListFromEnd(linkedList, TEN_THOUSAND);
        start = System.currentTimeMillis();
        ListADT.removeEvensByIterator(linkedList);
        end = System.currentTimeMillis();
        logger.info("将长度为10000的双链表列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
        
        // 计算长度为1000000的LinkedList中移除偶数元素所需的时间(一半为奇数, 一半为偶数)
        linkedList.clear();
        ListADT.makeListFromEnd(linkedList, ONE_MILLION);
        start = System.currentTimeMillis();
        ListADT.removeEvensByIterator(linkedList);
        end = System.currentTimeMillis();
        logger.info("将长度为1000000的双链表列表(一半为奇数, 一半为偶数)中偶数移除所花费的时间为: {}", end - start);
    }

}
