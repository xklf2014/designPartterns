package com.story.designpatterns.bridge.v3;

public class WildGift extends Gift {
    public WildGift(GiftImpl gift) {
        this.gift = gift;
    }
}
