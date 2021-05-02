package com.zpwtt.visitor;

public interface Visitor {
    void visitCpu(CPU cpu);
    void visitMemory(Memory cpu);
    void visitBoard(Board board);
}
