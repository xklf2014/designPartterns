package com.story.designpatterns.observer.zen.v2;

import com.story.designpatterns.observer.zen.v1.IHanFeiZi;
import com.story.designpatterns.observer.zen.v1.LiSi;

public class HanFeiZi implements IHanFeiZi {

    private LiSi liSi = new LiSi();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
        this.liSi.update("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        this.liSi.update("韩非子在娱乐");
    }
}
