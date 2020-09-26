package com.story.designpatterns.bridge.zen.v2;


public class Client {
    public static void main(String[] args) {
        System.out.println("-------山寨公司是这样运行的-------");
        IPodCorp corp = new IPodCorp();
        corp.makeMoney();
    }
}
