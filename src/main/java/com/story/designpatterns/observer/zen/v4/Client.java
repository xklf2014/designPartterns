package com.story.designpatterns.observer.zen.v4;

import java.util.Observer;

public class Client {
    public static void main(String[] args) {
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
        Observer liuSi = new LiuSi();

        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);

        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
