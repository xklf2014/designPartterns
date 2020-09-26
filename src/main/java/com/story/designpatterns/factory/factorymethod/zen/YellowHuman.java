package com.story.designpatterns.factory.factorymethod.zen;

public class YellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄种人会大笑");
    }

    @Override
    public void cry() {
        System.out.println("黄种人会苦");
    }

    @Override
    public void talk() {
        System.out.println("黄种人会说话");
    }
}
