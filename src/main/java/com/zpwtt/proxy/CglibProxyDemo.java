package com.zpwtt.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhuangpeng
 */
public class CglibProxyDemo {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PassiveProxyClass.class);
        enhancer.setCallback(new TimeMethodInterceptor());

        PassiveProxyClass passiveProxyClass = (PassiveProxyClass) enhancer.create();
        passiveProxyClass.say();
    }
}

class TimeMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("before");
        Object result = null;
        result = proxy.invokeSuper(obj, args);
        System.out.println("after");
        return result;
    }
}


class PassiveProxyClass {

    public void say() {
        System.out.println("====我被执行了====");
    }
}