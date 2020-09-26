package com.story.designpatterns.proxy.zen;

public class JiaShi implements KindWomen {
    @Override
    public void makeEyeWithMan() {
        System.out.println("贾氏在抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("贾氏正在Happy中......");
    }
}
