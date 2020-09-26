package com.story.designpatterns.template_method.zen.v2;

public class HummerH2Model extends HummerModel {
    @Override
    void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    void enginegBoom() {
        System.out.println("悍马H2引擎声音是这样在...");
    }

}
