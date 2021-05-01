package com.zpwtt.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHander implements InvocationHandler {

    private Movable movable;

    public LogHander(Movable movable) {
        this.movable = movable;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method " + method.getName() + " start..");
        Object o = method.invoke(movable, args);
        System.out.println("method " + method.getName() + " end..");
        return o;
    }
}
