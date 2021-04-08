package com.zpwtt.singleton;

/**
 * 枚举
 * 不仅可以解决线程同步，还可以防止反序列化
 * @author zhuangpeng
 */
public enum Singleton07 {

    INSTANCE;

    public void say() {
        System.out.println("111");
    }

    public void whateverMethod() {}
}
