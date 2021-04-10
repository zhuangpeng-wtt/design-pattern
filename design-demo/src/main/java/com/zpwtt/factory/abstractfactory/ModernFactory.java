package com.zpwtt.factory.abstractfactory;

/**
 * 具体工厂-产生具体实现
 * @author zhuangpeng
 */
public class ModernFactory extends AbstractFactory {

    @Override
    AbstractFood createFood() {
        return new MushRoom();
    }

    @Override
    AbstractWeapon createWeapon() {
        return new Ak47();
    }

    @Override
    AbstractVehicle createVehicle() {
        return new Broom();
    }
}
