package com.story.designpatterns.template_method.zen.v1;

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

    @Override
    void run() {
        this.start();//先发动汽车
        this.enginegBoom();//引擎开始轰鸣
        this.alarm();//然后就开始跑了，跑的过程中遇到一条狗挡路，就按喇叭
        this.stop();//到达目的地就停车
    }
}
