package com.story.designpatterns.proxy.aop.v1;

public class LogProxy {
    public void before(){
        System.out.println("before.........");
    }

    public void after(){
        System.out.println("after.......");
    }
}
