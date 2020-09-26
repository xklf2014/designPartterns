package com.story.designpatterns.builder.zen.v3;

import com.story.designpatterns.builder.zen.v1.BMWModel;
import com.story.designpatterns.builder.zen.v1.BenzModel;
import com.story.designpatterns.builder.zen.v2.BMWBuilder;
import com.story.designpatterns.builder.zen.v2.BenzBuilder;

import java.util.ArrayList;

public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    /*
     * A类型的奔驰车模型，先start,然后stop,其他什么引擎了，喇叭一概没有
     */
    public BenzModel getABenzModel(){
        this.sequence.clear();

        this.sequence.add("start");
        this.sequence.add("stop");
        benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.getCarModel();
    }

    /*
     * B型号的奔驰车模型，是先发动引擎，然后启动，然后停止，没有喇叭
     */
    public BenzModel getBBenzModel(){
        this.sequence.clear();

        this.sequence.add("engineboom");
        this.sequence.add("start");
        this.sequence.add("stop");
        benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.getCarModel();
    }

    /*
     * C型号的宝马车是先按下喇叭（炫耀嘛），然后启动，然后停止
     */
    public BMWModel getCBmwModel(){
        this.sequence.clear();

        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        bmwBuilder.setSequence(sequence);
        return (BMWModel) bmwBuilder.getCarModel();
    }

    /*
     * D类型的宝马车只有一个功能，就是跑，启动起来就跑，永远不停止，牛叉
     */
    public BMWModel getDBmwModel(){
        this.sequence.clear();

        this.sequence.add("start");
        bmwBuilder.setSequence(sequence);
        return (BMWModel) bmwBuilder.getCarModel();
    }

}
