package com.zpwtt.factory.abstractfactory;

/**
 * @author zhuangpeng
 */
public class AbstractFactoryMain {

    public static void main(String[] args) {
        //指定具体工厂可以生成产品簇
        AbstractFactory factory = new ModernFactory();

        //得到指定的工厂去生产一个个对象
        AbstractFood food = factory.createFood();
        AbstractVehicle vehicle = factory.createVehicle();
        AbstractWeapon weapon = factory.createWeapon();
    }
}
