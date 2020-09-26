package com.story.designpatterns.factory.abstractfactory.zen;

//编写一个抽象类，根据enum创建一个人类出来
public abstract class AbstractHumanFactory implements HumanFactory {

    //给定一个性别人类，创建一个人类出来 专业术语是产生产品等级
    protected Human createHuman(HumanEnum humanEnum) {
        Human human = null;

        if (!humanEnum.getValue().equals("")) {
            try {
                human = (Human) Class.forName(humanEnum.getValue()).newInstance();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }

        }
        return human;
    }
}
