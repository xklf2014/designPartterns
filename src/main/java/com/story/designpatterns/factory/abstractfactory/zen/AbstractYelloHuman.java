package com.story.designpatterns.factory.abstractfactory.zen;

public abstract class AbstractYelloHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄种人类会笑");
    }

    @Override
    public void cry() {
        System.out.println("黄种人类会哭");
    }

    @Override
    public void talk() {
        System.out.println("黄种人类会说话");
    }

}
