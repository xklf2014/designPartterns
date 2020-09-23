package com.story.designpatterns.bridge.v3;

public class WarmGift extends Gift {
    public WarmGift(GiftImpl gift) {
        this.gift = gift;
    }
}
