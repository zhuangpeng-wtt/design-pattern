package com.zpwtt.singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用
 * 缺点:不管用到与否,类装载时就完成实例化
 * @author zhuangpeng
 */
public class Singleton01 {
    /**
     * JVM保证每个class只会落到内存一次
     * static修饰的变量是再class落在内存之后马上就初始化的，JVM也保证只初始化一次
     */
    private static final Singleton01 INSTANCE = new Singleton01();

    /**
     * 设置构造方法为私有的，不允许new新对象
     */
    private Singleton01() {

    }

    /**
     * 通过静态方法获取该对象实例
     * @return
     */
    public static Singleton01 getInstance() {
        return INSTANCE;
    }
}
