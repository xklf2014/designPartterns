package com.story.designpatterns.mediator.zen.v2;

public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
        this.stock = new Stock(this);
    }

    //中介者最重要的方法，叫做事件方法，处理多个对象之间的关系
    public abstract void excute(String str,Object...objects);
}
