package com.zpwtt.visitor;


public class Computer {
    ComputerPart cpu = new CPU();
    ComputerPart memory = new Memory();
    ComputerPart board = new Board();

    public void accept(Visitor v) {
        this.cpu.accept(v);
        this.memory.accept(v);
        this.board.accept(v);
    }

    public static void main(String[] args) {
        PersoneVisitor p = new PersoneVisitor();
        new Computer().accept(new PersoneVisitor());

        System.out.println(p.totalPrice);
    }
}
