package com.story.designpatterns.observer.v2;
/**
 * 加入观察者
 */
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeup();
    }
}

class Dad{
    public void feed(){
        System.out.println("dad feeding...");
    }
}

class Child{
    private Dad dad = new Dad();
    private boolean cry = false;

    public boolean isCry(){
        return cry;
    }

    public void wakeup(){
        System.out.println("Waked up,wuwuwu.........");
        cry = true;
        dad.feed();
    }
}
