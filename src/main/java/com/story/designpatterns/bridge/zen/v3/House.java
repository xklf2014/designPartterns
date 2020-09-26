package com.story.designpatterns.bridge.zen.v3;

public class House extends Product {
    @Override
    public void beProduced() {
        System.out.println("生产出的房子是这个样子的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了...");
    }
}
