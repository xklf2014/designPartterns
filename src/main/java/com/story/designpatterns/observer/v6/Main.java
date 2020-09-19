package com.story.designpatterns.observer.v6;

import java.util.ArrayList;
import java.util.List;

/**
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 * 大多数时候，我们处理事件的时候，需要事件源对象
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeup();
    }
}

class Dad implements Observer {
    public void feed(){
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnwakeup(WakeupEvent event) {
        if (event.loc.equals("bed")){
            feed();
            event.source.eat(); //调用事件源
        }else {
            System.out.println("爸爸抱起宝宝");
            feed();
        }
    }
}

class Mom implements Observer {
    public void huge(){
        System.out.println("Mon huging ...");
    }

    @Override
    public void actionOnwakeup(WakeupEvent event) {
        if (event.loc.equals("bed")){
            huge();
        }else{
            System.out.println("妈妈将宝宝返回摇篮");
        }

    }
}

class Dog implements Observer {
    public void wang(){
        System.out.println("Dog wangwang...");
    }

    @Override
    public void actionOnwakeup(WakeupEvent event) {

        if (event.loc.equals("bed")){
            wang();
        }else{
            System.out.println("狗狗守在宝宝旁边");
        }
    }
}

interface Observer{
    void actionOnwakeup(WakeupEvent event);
}

class WakeupEvent{
    long timestamp;
    String loc;
    Child source;

    public WakeupEvent(long timestamp, String loc, Child source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }
}

class Child{
    private List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mom());
        observers.add(new Dog());
    }

    private boolean cry = false;

    public boolean isCry(){
        return cry;
    }

    public void wakeup(){
        WakeupEvent event = new WakeupEvent(System.currentTimeMillis(),"bed",this);
        System.out.println("Waked up,wuwuwu.........");
        cry = true;
        for (Observer observer : observers){
            observer.actionOnwakeup(event);
        }
    }

    public void eat(){
        System.out.println("宝宝吃饱了，不哭了");
        cry = false;
    }
}
