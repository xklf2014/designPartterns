package com.story.designpatterns.chainofresponsibitily.zen.v2;

import com.story.designpatterns.chainofresponsibitily.zen.v1.IWomen;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(3) + 1, "我要出去逛街"));
        }

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women : arrayList) {
            father.handlerMessage(women);
        }
    }
}
