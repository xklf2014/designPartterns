package com.story.designpatterns.factory.factorymethod.zen;

public class NvWa {
    public static void main(String[] args) {
        System.out.println("------------造出的第一批人是这样的：白人-----------------");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.laugh();
        whiteHuman.cry();
        whiteHuman.talk();

        System.out.println("\n\n------------造出的第二批人是这样的：黑人-----------------");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.laugh();
        blackHuman.talk();
        blackHuman.cry();

        System.out.println("\n\n------------造出的第三批人是这样的：黄色人类-----------------");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.laugh();;
        yellowHuman.cry();
        yellowHuman.talk();

        //女娲烦躁了，爱是啥人类就是啥人类，烧吧
        for (int i = 0; i < 1000; i++) {
            System.out.println("\n\n------------随机产生人类了-----------------" +  i);
            Human human = HumanFactory.createHuman();
            human.laugh();
            human.cry();
            human.talk();
        }
    }
}
