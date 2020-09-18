package com.story.designpatterns.factory;

public class Ship   implements Moveable {
    @Override
    public void go() {
        System.out.println("ship wuwuwu");
    }
}
