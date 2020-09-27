package com.story.designpatterns.observer.zen.v3;


import java.util.ArrayList;

public class HanFeiZi implements Observable {

    private ArrayList<Observer> observerList = new ArrayList<Observer>();
    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver(String context) {
        for (Observer observer : observerList){
            observer.update(context);
        }
    }

    public void haveBreakfast(){
        System.out.println("韩非子:开始吃饭了...");
        this.notifyObserver("韩非子在吃饭");
    }

    public void haveFun(){
        System.out.println("韩非子:开始娱乐了...");
        this.notifyObserver("韩非子在娱乐");
    }
}
