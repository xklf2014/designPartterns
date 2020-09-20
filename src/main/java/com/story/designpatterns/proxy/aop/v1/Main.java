package com.story.designpatterns.proxy.aop.v1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Tank tank = context.getBean("tank", Tank.class);
        tank.move();
    }
}
