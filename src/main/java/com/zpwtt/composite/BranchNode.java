package com.zpwtt.composite;

import java.util.ArrayList;
import java.util.List;

public class BranchNode extends Node{

    List<Node> nodes = new ArrayList<>();
    String name;

    @Override
    public void p() {
        System.out.println(name);
    }

    public void add(Node n) {
        nodes.add(n);
    }
}
