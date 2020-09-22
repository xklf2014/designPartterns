package com.story.designpatterns.visitor;

public class Computer {
    ComputerPart cpu = new CPU();
    ComputerPart memory = new Memory();
    ComputerPart board = new Board();

    public void accept(Visitor_ visitor){
        this.cpu.accept(visitor);
        this.board.accept(visitor);
        this.memory.accept(visitor);
    }

    public static void main(String[] args) {
        PersonelVisitor pv = new PersonelVisitor();
        new Computer().accept(pv);
        System.out.println(pv.totalPrice);
        System.out.println("-------------");
        CorpVisitor cv = new CorpVisitor();
        new Computer().accept(cv);
        System.out.println(cv.totalPrice);
    }
}

abstract class ComputerPart {
    abstract void accept(Visitor_ v);

    abstract double getPrice();
}

class CPU extends ComputerPart {

    @Override
    void accept(Visitor_ v) {
        v.visitCpu(this);
    }

    @Override
    double getPrice() {
        return 2000;
    }
}

class Memory extends ComputerPart {

    @Override
    void accept(Visitor_ v) {
        v.visitMemory(this);
    }

    @Override
    double getPrice() {
        return 800;
    }
}

class Board extends ComputerPart {

    @Override
    void accept(Visitor_ v) {
        v.visitBoard(this);
    }

    @Override
    double getPrice() {
        return 1500;
    }
}


interface Visitor_ {
    void visitCpu(CPU cpu);

    void visitMemory(Memory memory);

    void visitBoard(Board board);
}

class PersonelVisitor implements Visitor_ {
    double totalPrice = 0.0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.9;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.95;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.88;
    }
}

class CorpVisitor implements Visitor_ {
    double totalPrice = 0.0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.8;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.75;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.85;
    }
}