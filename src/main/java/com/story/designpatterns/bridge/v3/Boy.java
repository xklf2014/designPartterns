package com.story.designpatterns.bridge.v3;
/**
 *
 * 使用桥接模式：
 * 分离抽象与具体实现，让他们可以独自发展
 * Gift -> WarmGift ColdGift WildGift
 * GiftImpl -> Flower Ring Car
 *
 *
 * */
public class Boy {
    public void chase(Girl girl) {
        Gift gift = new WarmGift(new Flower());
        gave(girl, gift);
    }

    private void gave(Girl girl, Gift gift) {
        System.out.println("送给女孩" + girl.name + gift);
    }
}
