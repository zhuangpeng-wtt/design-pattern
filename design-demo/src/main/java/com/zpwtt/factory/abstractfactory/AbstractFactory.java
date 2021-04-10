package com.zpwtt.factory.abstractfactory;

/**
 * 抽象工厂
 * @author zhuangpeng
 */
public abstract class AbstractFactory {

    abstract AbstractFood createFood();

    abstract AbstractWeapon createWeapon();

    abstract AbstractVehicle createVehicle();
}
