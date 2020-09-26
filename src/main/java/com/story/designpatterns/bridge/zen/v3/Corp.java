package com.story.designpatterns.bridge.zen.v3;

public abstract class Corp {
    //定义一个产品对象，抽象的了，不知道具体是什么产品
    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney(){
        this.product.beProduced();
        this.product.beSelled();
    }
}
