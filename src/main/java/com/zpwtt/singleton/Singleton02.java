package com.zpwtt.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 懒汉式-lazy
 * 优点：解决了不使用也加载的问题，在需要使用时再初始化类
 * 缺点：带来了线程不安全的问题
 * @author zhuangpeng
 */
public class Singleton02 {
    private static Singleton02 INSTANCE;

    /**
     * 设置构造函数为私有的，禁止通过构造方法new一个类
     */
    private Singleton02() {
    }

    /**
     * 当有两个线程同时访问getInstance()方法时
     * 会获取到两个不通的INSTANCE实例-导致线程不安全
     * @return
     */
    private static Singleton02 getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new Singleton02();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            cachedThreadPool.execute(() -> System.out.println(Singleton02.getInstance().hashCode()));
        }
    }
}
