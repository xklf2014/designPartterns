package com.story.designpatterns.bridge.zen.v2;

import com.story.designpatterns.bridge.zen.v1.Corp;

public class IPodCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("我生产iPod...");
    }

    @Override
    protected void sell() {
        System.out.println("iPod畅销...");
    }

    @Override
    protected void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}
