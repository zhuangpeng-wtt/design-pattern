package com.zpwtt.singleton;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 * @author zhuangpeng
 */
public class Singleton06 {

    /**
     * 设置构造函数为私有的，禁止通过构造方法new一个类
     */
    private Singleton06() {
    }

    /**
     * 静态内部类是不会在JVMJ加载外部类的时候被一起加载的
     * 内部类可以访问私有的构造方法
     */
    private static class SingletonHolder {
        private static final Singleton06 INSTANCE = new Singleton06();
    }

    /**
     * 这种方式能达到双检锁方式一样的功效，但实现更简单
     * 对静态域使用延迟初始化，应使用这种方式而不是双检锁方式
     * 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用
     */
    private static Singleton06 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
