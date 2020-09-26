package com.story.designpatterns.factory.abstractfactory.zen;

/**
 * 定义一个人类的统称，问题出来了，刚刚定义的时候忘记定义性别了
 * 这个重要的问题非修改不可，否则这个世界上太多太多的东西不存在了
 */
public interface Human {

    void laugh();

    void cry();

    void talk();

    void gender();
}
