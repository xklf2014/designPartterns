package com.story.designpatterns.factory.factorymethod;

public class Ship   implements Movable {
    @Override
    public void go() {
        System.out.println("ship wuwuwu");
    }
}
