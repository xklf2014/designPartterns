package com.story.designpatterns.bridge.zen.v3;

public class Clothes extends Product {
    @Override
    public void beProduced() {
        System.out.println("生产出的衣服是这个样子的...");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的衣服卖出去了...");
    }


}
