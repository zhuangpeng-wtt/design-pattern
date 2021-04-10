package com.zpwtt.factory.factorymethod;

/**
 * 工厂方法通过创建不通的工厂类
 * 实现增加获取不同的产品对象
 */
public class CarFactory {

    public Car createCar() {
        System.out.println("before processing");
        return new Car();
    }
}
