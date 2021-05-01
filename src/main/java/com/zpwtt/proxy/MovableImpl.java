package com.zpwtt.proxy;

/**
 * @author zhuangpeng
 */
public class MovableImpl implements Movable {

    @Override
    public void move() {
        System.out.println("===move===");
    }

    @Override
    public void file() {
        System.out.println("===file===");
    }
}
