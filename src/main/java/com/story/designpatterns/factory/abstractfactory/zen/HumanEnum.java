package com.story.designpatterns.factory.abstractfactory.zen;

public enum HumanEnum {
    YellowMaleHuman("com.story.designpatterns.factory.abstractfactory.zen.YellowMaleHuman"),
    YellowFemaleHuman("com.story.designpatterns.factory.abstractfactory.zen.YellowFemaleHuman"),
    WhiteFemaleHuman("com.story.designpatterns.factory.abstractfactory.zen.WhiteFemaleHuman"),
    WhiteMaleHuman("com.story.designpatterns.factory.abstractfactory.zen.WhiteMaleHuman"),
    BlackFemaleHuman("com.story.designpatterns.factory.abstractfactory.zen.BlackFemaleHuman"),
    BlackMaleHuman("com.story.designpatterns.factory.abstractfactory.zen.BlackMaleHuman");

    private String value = "";

    HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
