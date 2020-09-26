package com.story.designpatterns.adapter.zen.v2;

import com.story.designpatterns.adapter.zen.v1.IUserInfo;

public class App {
    public static void main(String[] args) {
        IUserInfo youngGirl = new OuterUserInfo();
        for (int i = 0; i < 20; i++) {
            youngGirl.getHomeTelNumber();
        }
    }
}
