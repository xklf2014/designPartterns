package com.story.designpatterns.strategy.zen;

/**
 * 就这三招，搞的周郎是“陪了夫人又折兵”呀！这就是策略模式，高内聚低耦合的特点也表现出来了，
 * 还有一个就是扩展性，也就是 OCP 原则，策略类可以继续增加下去，只要修改 Context.java 就可以了
 *
 * */

public class Zhaoyun {
    public static void main(String[] args) {
        //赵云出场了，他根据诸葛亮给他的交代，依次拆开妙计
        Context context;

        System.out.println("-----------刚刚到吴国的时候拆第一个-------------");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n");

        System.out.println("-----------刘备乐不思蜀了，拆第二个了-------------");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("\n");

        System.out.println("-----------孙权的小兵追了，咋办？拆第三个-------------");
        context = new Context(new BlockEnemy());
        context.operate();


    }
}
