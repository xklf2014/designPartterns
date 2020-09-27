package com.story.designpatterns.chainofresponsibitily.zen.v1;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(3)+1, "我要出去逛街"));
        }

        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        for (IWomen women : arrayList) {
           switch (women.getType()){
               case 1:
                   father.handleMessage(women);
                   break;
               case 2:
                   husband.handleMessage(women);
                   break;
               case 3:
                   son.handleMessage(women);
               default:
                   System.out.println("啥也不做");
                   break;
           }

        }
    }
}
