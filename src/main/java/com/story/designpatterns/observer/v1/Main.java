package com.story.designpatterns.observer.v1;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        while (!child.isCry()){
            try {
                Thread.sleep(1000);
                child.wakeup();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class Child{
    private boolean cry = false;

    public boolean isCry(){
        return cry;
    }

    public void wakeup(){
        System.out.println("Waked up,wuwuwu.........");
        cry = true;
    }
}
