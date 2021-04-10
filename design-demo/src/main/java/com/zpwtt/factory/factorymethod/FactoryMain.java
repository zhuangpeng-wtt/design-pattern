package com.zpwtt.factory.factorymethod;

/**
 * @author zhuangpeng
 */
public class FactoryMain {

    public static void main(String[] args) {

        /**
         * 工厂方法
         * 通过一个工厂接口来创建不通的工厂类型
         */
        Moveable car = new CarFactory().createCar();
    }
}
