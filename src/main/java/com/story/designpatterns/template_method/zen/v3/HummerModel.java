package com.story.designpatterns.template_method.zen.v3;

public abstract class HummerModel {
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run(){
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
