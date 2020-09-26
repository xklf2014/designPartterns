package com.story.designpatterns.factory.factorymethod.zen.lazy_initialization;


import com.story.designpatterns.factory.factorymethod.zen.ClassUtils;
import com.story.designpatterns.factory.factorymethod.zen.Human;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * 工厂方法模式还有一个非常重要的应用，就是延迟始化(Lazy initialization)，什么是延迟始化呢？
 * 一个对象初始化完毕后就不释放，等到再次用到得就不用再次初始化了，直接从内存过中拿到就可以了
 */
public class HumanFactory {
    private static HashMap<String, Human> humans = new HashMap<>();

    //定一个烤箱，泥巴塞进去，人就出来，这个太先进了
    public static Human createHuman(Class c) {

        Human human = null;
        try {
            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            } else {
                human = (Human) Class.forName(c.getName()).newInstance();
                humans.put(c.getSimpleName(), human);
            }

        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误！");
        } catch (InstantiationException e) {
            System.out.println("必须指定人类的颜色");
        } catch (ClassNotFoundException e) {
            System.out.println("你指定的人类找不到！");
        }
        return human;
    }

}
