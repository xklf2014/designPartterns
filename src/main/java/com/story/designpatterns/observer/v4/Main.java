package com.story.designpatterns.observer.v4;

import java.util.ArrayList;
import java.util.List;

/**
 * 分离观察者与被观察者
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeup();
    }
}

class Dad implements Observer{
    public void feed(){
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnwakeup() {
        feed();
    }
}

class Mom implements Observer{
    public void huge(){
        System.out.println("Mon huging ...");
    }

    @Override
    public void actionOnwakeup() {
        huge();
    }
}

class Dog implements Observer{
    public void wang(){
        System.out.println("Dog wangwang...");
    }

    @Override
    public void actionOnwakeup() {
        wang();
    }
}

interface Observer{
    void actionOnwakeup();
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
        System.out.println("Waked up,wuwuwu.........");
        cry = true;
        for (Observer observer : observers){
            observer.actionOnwakeup();
        }
    }
}
