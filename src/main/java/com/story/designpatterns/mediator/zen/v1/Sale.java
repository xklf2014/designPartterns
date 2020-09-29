package com.story.designpatterns.mediator.zen.v1;

import java.util.Random;

public class Sale {
    public void sellIBMComputer(int num){
        Stock stock = new Stock();
        Purchase purchase = new Purchase();

        if (stock.getStockNumber() < num){
            purchase.buyIBMcomputer(num);
        }
        System.out.println("销售IBM电脑"+num+"台");
        stock.decrease(num);
    }

    //反馈销售情况,0——100之间变化，0代表根本就没人卖，100代表非常畅销，出一个卖一个
    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为："+saleStatus);
        return saleStatus;
    }

    public void offSale(){
        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑"+stock.getStockNumber()+"台");
    }
}
