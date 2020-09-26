package com.story.designpatterns.factory.abstractfactory.zen;

public class BlackFemaleHuman extends AbstractBlackHuman {
    @Override
    public void gender() {
        System.out.println("该黑种人的性别为女...");
    }
}
