package com.story.designpatterns.observer.v3;
/**
 * 加入多个观察者
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

class Mom{
    public void huge(){
        System.out.println("Mon huging ...");
    }
}

class Dog{
    public void wang(){
        System.out.println("Dog wangwang...");
    }
}

class Child{
    private Dad dad = new Dad();
    private Mom mom = new Mom();
    private Dog dog = new Dog();
    private boolean cry = false;

    public boolean isCry(){
        return cry;
    }

    public void wakeup(){
        System.out.println("Waked up,wuwuwu.........");
        cry = true;
        dad.feed();
        mom.huge();
        dog.wang();
    }
}
