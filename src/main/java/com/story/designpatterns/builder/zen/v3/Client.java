package com.story.designpatterns.builder.zen.v3;

import com.story.designpatterns.builder.zen.v1.BMWModel;
import com.story.designpatterns.builder.zen.v1.BenzModel;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        BenzModel aBenzModel = director.getABenzModel();
        aBenzModel.run();
        System.out.println("-----------------");
        BenzModel bBenzModel = director.getBBenzModel();
        bBenzModel.run();
        System.out.println("-----------------");
        BMWModel cBmwModel = director.getCBmwModel();
        cBmwModel.run();
        System.out.println("-----------------");
        BMWModel dBmwModel = director.getDBmwModel();
        dBmwModel.run();
    }
}
