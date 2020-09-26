package com.story.designpatterns.state.v2;

public class MM {
    String name;
    MMState state = new HappyState();

    public void smile() {
        state.smile();
    }

    public void cry() {
        state.cry();
    }

    public void say() {
        state.say();
    }
}
