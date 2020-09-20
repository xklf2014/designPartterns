package com.story.designpatterns.proxy.v4;

import java.util.Random;

public class Tank implements Movable {

    @Override
    public void move() {
        System.out.println("tank move...");
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new TankTimeProxy(new TankLogProxy(new Tank())).move();

    }
}

class TankTimeProxy implements Movable {
    Movable movable;

    public TankTimeProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("into time proxy  begin");
        long start = System.currentTimeMillis();
        movable.move();
        long end = System.currentTimeMillis();
        System.out.println("into time proxy  end");
        System.out.println("take " + (end - start));
    }
}

class TankLogProxy implements Movable {
    Movable movable;

    public TankLogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("start moving!!!");
        movable.move();
        System.out.println("moving end!!!");
    }
}

interface Movable {
    void move();
}
