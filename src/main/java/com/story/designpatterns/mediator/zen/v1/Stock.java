package com.story.designpatterns.mediator.zen.v1;

public class Stock {
    private static int COMPUTER_NUMBER = 100;

    public void increase(int num) {
        COMPUTER_NUMBER += num;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    public void decrease(int num) {
        COMPUTER_NUMBER = (COMPUTER_NUMBER - num) < 0 ? 0 : COMPUTER_NUMBER - num;
        System.out.println("库存数量为："+COMPUTER_NUMBER);
    }

    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }

    public void clearStock(){
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("清理存货数量为："+COMPUTER_NUMBER);
        sale.offSale();
        purchase.refuseBuyIBM();
    }
}
