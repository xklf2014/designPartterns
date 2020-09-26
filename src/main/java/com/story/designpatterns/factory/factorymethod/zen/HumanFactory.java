package com.story.designpatterns.factory.factorymethod.zen;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.*;

/**
 * 今天讲女娲造人的故事，这个故事梗概是这样的：
 * 很久很久以前，盘古开辟了天地，用身躯造出日月星辰、山川草木，天地一片繁华
 * One day，女娲下界走了一遭，哎！太寂寞，太孤独了，没个会笑的、会哭的、会说话的东东
 * 那怎么办呢？不用愁，女娲，神仙呀，造出来呀，然后捏泥巴，放八卦炉（后来这个成了太白金星的宝
 * 贝）中烤，于是就有了人：
 * * 我们把这个生产人的过程用Java程序表现出来：
 */
public class HumanFactory {
    //定一个烤箱，泥巴塞进去，人就出来，这个太先进了
    public static Human createHuman(Class c){
        Human human = null;
        try{
            human = (Human) Class.forName(c.getName()).newInstance();

        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误！");
        } catch (InstantiationException e) {
            System.out.println("必须指定人类的颜色");
        } catch (ClassNotFoundException e) {
            System.out.println("你指定的人类找不到！");
        }
        return human;
    }

    public static Human createHuman(){
        Human human = null;

        List<Class> concrateHumanList = ClassUtils.getAllClassByInterface(Human.class);

        Random random = new Random();
        int rand = random.nextInt(concrateHumanList.size());
        human = createHuman(concrateHumanList.get(rand));

        return human;
    }


}
