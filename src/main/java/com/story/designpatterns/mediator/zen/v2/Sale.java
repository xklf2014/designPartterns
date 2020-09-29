package com.story.designpatterns.mediator.zen.v2;

import java.util.Random;

public class Sale extends AbstractColleague {
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellIBMComputer(int number){
        super.mediator.excute("sale.sell",number);
        System.out.println("销售IBM电脑"+number+"台");
    }

    //反馈销售情况,0——100之间变化，0代表根本就没人卖，100代表非常畅销，出1一个卖一个
    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为："+saleStatus);
        return saleStatus;
    }

    public void offSale(){
        super.mediator.excute("sale.offsale");
    }
}
