package com.story.designpatterns.dp01_singleton;
/**
 * lazy loading,也称为懒汉式
 * 优点：但需要使用实例的时候才初始化
 * 缺点：线程不安全
 *
 * */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03(){}

    public static Mgr03 getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public void m(){
        System.out.println("hahahaha");
    }

    public static void main(String[] args) {
   /*     Mgr03 m1 = Mgr03.getInstance();
        Mgr03 m2 = Mgr03.getInstance();
        System.out.println(m1 == m2);*/

        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}
