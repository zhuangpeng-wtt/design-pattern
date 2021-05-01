package com.zpwtt.proxy;

import java.lang.reflect.Proxy;

public class ProxyDemo {

    public static void main(String[] args) {

        Movable movable = (Movable) Proxy.newProxyInstance(MovableImpl.class.getClassLoader(),
                new Class[]{Movable.class},
                new LogHander(new MovableImpl())
        );

        movable.move();
        movable.file();
    }
}
