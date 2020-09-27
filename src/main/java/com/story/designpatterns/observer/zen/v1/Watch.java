package com.story.designpatterns.observer.zen.v1;

public class Watch extends Thread {
    private HanFeiZi hanFeiZi;
    private LiSi liSi;
    private String type;

    public Watch(HanFeiZi hanFeiZi,LiSi liSi ,String type){
        this.hanFeiZi = hanFeiZi;
        this.liSi = liSi;
        this.type = type;
    }

    @Override
    public void run() {
        while (true){
            synchronized (this){
                if (this.type.equals("breakfast")){
                    if (this.hanFeiZi.isHaveBreakfast()){
                        this.liSi.update("韩非子在吃饭");
                        this.hanFeiZi.setHaveBreakfast(false);
                    }
                }else {
                    if (this.hanFeiZi.isHaveFun()){
                        this.liSi.update("韩非子在娱乐");
                        this.hanFeiZi.setHaveFun(false);
                    }
                }
            }

        }
    }
}
