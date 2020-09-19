package com.story.designpatterns.factory.abstractfactory;

public class MushRoom extends Food {
    @Override
    void eat() {
        System.out.println("eat mushroom ,life + 50");
    }
}
