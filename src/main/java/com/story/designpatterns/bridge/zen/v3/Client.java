package com.story.designpatterns.bridge.zen.v3;

public class Client {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("-------房地产公司是这个样子运行的-------");
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();
        System.out.println("\n");

        System.out.println("-------山寨公司是这样运行的-------");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();
        System.out.println("\n");
        ShanZhaiCorp clothesCorp = new ShanZhaiCorp(new Clothes());
        clothesCorp.makeMoney();
    }
}
