package com.story.designpatterns.proxy.aop.v2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogProxy {
    @Before("execution(void com.story.designpatterns.proxy.aop.v2.Tank.move())")
    public void before() {
        System.out.println("before.........");
    }

    @After("execution(void com.story.designpatterns.proxy.aop.v2.Tank.move())")
    public void after() {
        System.out.println("after.......");
    }
}
