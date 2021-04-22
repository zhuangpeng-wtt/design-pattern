package com.zpwtt.singleton;

/**
 * 枚举
 * 不仅可以解决线程同步，还可以防止反序列化
 * 枚举类是没有构造方法的，所不能被java反射去实例化
 * @author zhuangpeng
 */
public enum Singleton07 {

    /**
     * 单例对象
     */
    INSTANCE;

    public void say() {
        System.out.println("111");
    }

    public void whateverMethod() {}
}
