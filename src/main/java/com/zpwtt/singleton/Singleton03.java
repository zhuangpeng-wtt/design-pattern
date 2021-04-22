package com.zpwtt.singleton;

/**
 * 懒汉式-lazy
 * 通过 synchronized 给代码块枷锁的方式结果线程不安全的问题
 * 缺点：效率降低
 * @author zhuangpeng
 */
public class Singleton03 {
    private static Singleton03 INSTANCE;

    /**
     * 设置构造函数为私有的，禁止通过构造方法new一个类
     */
    private Singleton03() {
    }

    /**
     * 通过 synchronized 加锁的方式来解决线程不安全的问题
     * @return
     */
    private static synchronized Singleton03 getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }
}
