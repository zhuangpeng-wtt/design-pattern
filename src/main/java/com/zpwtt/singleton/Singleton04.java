package com.zpwtt.singleton;

/**
 * 懒汉式-lazy
 * 通过 synchronized 给代码块枷锁的方式结果线程不安全的问题
 * 依旧线程不安全
 * @author zhuangpeng
 */
public class Singleton04 {

    private static Singleton04 INSTANCE;

    /**
     * 设置构造函数为私有的，禁止通过构造方法new一个类
     */
    private Singleton04() {
    }

    /**
     * 妄图通过减少同步代码块的方式提高效率，然而不可行
     * @return INSTANCE
     */
    private static Singleton04 getInstance() {
        if (null == INSTANCE) {
            synchronized (Singleton04.class) {
                INSTANCE = new Singleton04();
            }
        }
        return INSTANCE;
    }
}
