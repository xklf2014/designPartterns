package com.story.designpatterns.proxy.aop.v2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop_auto.xml");
        Tank t = context.getBean("tank", Tank.class);
        t.move();
    }
}
