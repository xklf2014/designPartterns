package com.story.designpatterns.observer.zen.v4;

import java.util.Observable;

public class HanFeiZi extends Observable {

    public void haveBreakfast(){
        System.out.println("韩非子:开始吃饭了...");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    public void haveFun(){
        System.out.println("韩非子:开始娱乐了...");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }
}
