package com.zpwtt.command;

public class InsterCommand extends Command {
    Content content;
    String strToInsert = "http://www.zhuangpeng.com";

    public InsterCommand(Content c) {
        this.content = c;
    }

    @Override
    public void doIt() {
        content.msg += strToInsert;
    }

    @Override
    public void undo() {
        content.msg = content.msg.substring(0, content.msg.length() - strToInsert.length());
    }
}
