package com.story.designpatterns.singleton.zen.v2;

public class Minister {
    public static void main(String[] args) {
        int minister = 10;

        for (int i = 0; i < minister; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.println("第"+(i+1)+"个大臣朝拜的是");
            emperor.emperorInfo();
        }
    }
}
