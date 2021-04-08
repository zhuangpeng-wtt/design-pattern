package com.zpwtt.singleton;

/**
 * 懒汉式-lazy
 * 双检锁/双重校验锁
 * @author zhuangpeng
 */
public class Singleton05 {
    private static Singleton05 INSTANCE;

    /**
     * 设置构造函数为私有的，禁止通过构造方法new一个类
     */
    private Singleton05() {
    }

    /**
     * synchronized给代码块加锁的方式
     * 双重校验-判断两次单例对象解决线程不安全
     * @return INSTANCE
     */
    private static Singleton05 getInstance() {
        if (null == INSTANCE) {
            synchronized (Singleton05.class) {
                if (null == INSTANCE) {
                    INSTANCE = new Singleton05();
                }
            }
        }
        return INSTANCE;
    }
}
