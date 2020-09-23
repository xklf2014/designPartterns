package com.story.designpatterns.bridge.v2;

import com.story.designpatterns.bridge.v1.Book;
import com.story.designpatterns.bridge.v1.Gift;
/**
 * 如果再有别的礼物，比如抽象类型：ToughGift ColdGift
 * 或者具体的某种实现：Ring Car
 *
 * 就会产生类的爆炸
 * WarmCar ColdRing WildCar WildFlower ...
 * */
public class Boy {
    public void chase(Girl girl){
        Gift gift = new Book();
        gave(girl,gift);
    }

    public void gave(Girl girl, Gift gift){
        System.out.println("送给女孩"+girl.name + gift);

    }
}
