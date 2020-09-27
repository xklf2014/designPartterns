package com.story.designpatterns.chainofresponsibitily.zen.v1;

public class Son implements IHandler {
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("母亲的请示是："+women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
