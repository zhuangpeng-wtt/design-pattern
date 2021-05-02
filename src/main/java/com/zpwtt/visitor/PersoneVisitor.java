package com.zpwtt.visitor;

public class PersoneVisitor implements Visitor {
    double totalPrice = 0.00;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.9;
    }

    @Override
    public void visitMemory(Memory cpu) {
        totalPrice += cpu.getPrice() * 0.9;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.9;
    }
}
