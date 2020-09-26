package com.story.designpatterns.bridge.zen.v3;

public class IPod extends Product {
    @Override
    public void beProduced() {
        System.out.println("生产出的iPod是这个样子的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的iPod卖出去了...");
    }
}
