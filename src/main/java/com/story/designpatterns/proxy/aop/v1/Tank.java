package com.story.designpatterns.proxy.aop.v1;

import java.util.Random;

public class Tank {
    public void move(){
        System.out.println("tank move");
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
