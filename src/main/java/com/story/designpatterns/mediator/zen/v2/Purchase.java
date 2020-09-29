package com.story.designpatterns.mediator.zen.v2;

public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyIBMComputer(int number){
        super.mediator.excute("purchase.buy",number);
    }

    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}
