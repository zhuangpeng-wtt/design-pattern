package com.zpwtt.command;

/**
 * 命令模式
 * @author zhuangpeng
 */
public abstract class Command {
    public abstract void doIt();
    public abstract void undo();
}
