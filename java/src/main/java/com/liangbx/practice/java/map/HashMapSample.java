package com.liangbx.practice.java.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 基本用法：
 *
 * 存储原理：
 * 1. 数组存储hash值，存在碰撞问题
 * 2. 用单向链表存储碰撞后的值
 *
 * 查找原理
 * 1. 通过hash(key)在数组中进行查找
 *
 * 原理：
 * 1. initialCapacity 初始容量，默认
 * 2. loadFactor 扩容因子，默认0.75f
 * 3. threshold 临界值
 *
 * 参考：
 * https://www.cnblogs.com/xiaolovewei/p/7993521.html
 * https://tech.meituan.com/2016/06/24/java-hashmap.html
 * https://zhuanlan.zhihu.com/p/38615394
 */
public class HashMapSample {

    static final int MAXIMUM_CAPACITY = 1 << 30;

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        System.out.println(tableSizeFor(17));
    }

    /**
     * Table表大小计算， 2的幂运算
     */
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
