package com.story.designpatterns.factory.abstractfactory.zen;

public class BlackMaleHuman extends AbstractBlackHuman {
    @Override
    public void gender() {
        System.out.println("该黑种人的性别为男...");
    }
}
