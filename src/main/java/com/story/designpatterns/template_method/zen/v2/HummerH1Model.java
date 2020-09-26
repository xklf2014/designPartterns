package com.story.designpatterns.template_method.zen.v2;

public class HummerH1Model extends HummerModel {
    @Override
    void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    void enginegBoom() {
        System.out.println("悍马H1引擎声音是这样在...");
    }

}
