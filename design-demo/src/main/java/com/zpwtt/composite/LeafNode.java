package com.zpwtt.composite;

public class LeafNode extends Node{
    String content;

    @Override
    public void p() {
        System.out.println(content);
    }
}
