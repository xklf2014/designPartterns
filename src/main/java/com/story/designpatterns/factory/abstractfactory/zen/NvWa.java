package com.story.designpatterns.factory.abstractfactory.zen;

public class NvWa {
    public static void main(String[] args) {
        //第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleHumanFactory();
        //第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        maleYellowHuman.cry();
        maleYellowHuman.laugh();
        maleYellowHuman.gender();
        maleYellowHuman.talk();

        Human whiteFemalHuman = femaleHumanFactory.createWhiteHuman();
        whiteFemalHuman.talk();
        whiteFemalHuman.gender();
        whiteFemalHuman.laugh();
        whiteFemalHuman.cry();

    }
}
