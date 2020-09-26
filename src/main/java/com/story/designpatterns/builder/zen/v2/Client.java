package com.story.designpatterns.builder.zen.v2;

import com.story.designpatterns.builder.zen.v1.CarModel;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engineboom");
        sequence.add("start");
        sequence.add("stop");

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        CarModel benz = benzBuilder.getCarModel();
        benz.run();
        System.out.println("--------------------");
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        CarModel bmw = bmwBuilder.getCarModel();
        bmw.run();

    }
}
