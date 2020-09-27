package com.story.designpatterns.observer.zen.v3;

public class LiuSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("刘斯：观察到韩非子活动，开始动作了...");
        this.happy(context);
        System.out.println("刘斯：真被乐死了\n");
    }

    private void happy(String context) {
        System.out.println("刘斯：因为" +context+",——所以我快乐呀！" );
    }

}
