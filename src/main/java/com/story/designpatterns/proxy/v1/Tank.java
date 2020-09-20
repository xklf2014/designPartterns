package com.story.designpatterns.proxy.v1;

import java.util.Random;

public class Tank implements Movable {

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("tank move...");
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("take "+(end-start));
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.move();
    }
}

interface Movable{
    void move();
}
