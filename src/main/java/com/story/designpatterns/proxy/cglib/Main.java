package com.story.designpatterns.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * 被代理类为final，则会抛出如下异常
 * Exception in thread "main" java.lang.IllegalArgumentException: Cannot subclass final class com.story.designpatterns.proxy.cglib.Tank
 * */
public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new LogMethodInterceptor());
        Tank tank = (Tank) enhancer.create();
        tank.move();
    }
}
class LogMethodInterceptor implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(o.getClass().getSuperclass().getName());
        System.out.println("before");
        Object invoke = null;
        invoke = methodProxy.invokeSuper(o,objects);
        System.out.println("after");
        return invoke;
    }
}

class Tank {
    public void move() {
        System.out.println("tank move...");
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}