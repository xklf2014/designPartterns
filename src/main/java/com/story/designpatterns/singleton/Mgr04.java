package com.story.designpatterns.singleton;
/**
 * 饿汉式
 * 保障了线程安全，由于加锁导致性能的降低
 *
 * */
public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04(){}

    public static synchronized Mgr04 getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public void m(){
        System.out.println("hahaha");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }
}
