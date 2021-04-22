package com.zpwtt.strategy;

/**
 * 对修改关闭对扩展开放
 * @author zhuangpeng
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
