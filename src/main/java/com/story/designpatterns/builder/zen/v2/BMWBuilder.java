package com.story.designpatterns.builder.zen.v2;

import com.story.designpatterns.builder.zen.v1.BMWModel;
import com.story.designpatterns.builder.zen.v1.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
