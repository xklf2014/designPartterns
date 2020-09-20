package com.story.designpatterns.proxy.v2;

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
        Tank tank = new Tank2();
        tank.move();
    }
}

class Tank2 extends Tank{
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println("take "+(end-start));
    }
}

interface Movable{
    void move();
}
