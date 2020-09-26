package com.story.designpatterns.adapter.zen.v1;

public class App {
    public static void main(String[] args) {
        //没有与外系统连接的时候，是这样写的
        IUserInfo yongGirl = new UserInfo();
        for (int i = 0; i < 20; i++) {
            yongGirl.getMobileNumber();
        }
    }
}
