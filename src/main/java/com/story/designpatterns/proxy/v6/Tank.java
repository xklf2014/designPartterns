package com.story.designpatterns.proxy.v6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * 如果有stop方法需要代理...
 * 如果想让LogProxy可以重用，不仅可以代理Tank，还可以代理任何其他可以代理的类型 Object
 * （毕竟日志记录，时间计算是很多方法都需要的东西），这时该怎么做呢？
 * 分离代理行为与被代理对象
 * 使用jdk的动态代理
 */
public class Tank implements Movable {

    @Override
    public void move() {
        System.out.println("tank move...");
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    // System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
    //jdk1.8需要指定上述参数
    public static void main(String[] args) {
        Tank tank = new Tank();
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(), new Class[]{Movable.class}, new LogHander(tank));
        m.move();

    }
}

/**
 * 具体实现
 *     public final void move() throws  {
 *         try {
 *             super.h.invoke(this, m3, (Object[])null);   //super.h即为传入InvocationHandler，此时调用invoke即等同于tank.move();
 *         } catch (RuntimeException | Error var2) {
 *             throw var2;
 *         } catch (Throwable var3) {
 *             throw new UndeclaredThrowableException(var3);
 *         }
 *     }
 *
 *
 * */

class LogHander implements InvocationHandler {

    Movable movable;

    public LogHander(Movable movable) {
        this.movable = movable;
    }

    public void before() {
        System.out.println("method start...");
    }

    public void after() {
        System.out.println("method end...");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(movable, args);
        after();
        return invoke;
    }
}

interface Movable {
    void move();
}
