package com.story.designpatterns.template_method;

public class Main {
    public static void main(String[] args) {
        F f = new Impl();
        f.m();
    }
}

abstract class F {
    void m(){
        update();
        paint();
    }

    abstract void update();
    abstract void paint();
}

class Impl extends F{

    @Override
    void update() {
        System.out.println("update");
    }

    @Override
    void paint() {
        System.out.println("paint");
    }
}
