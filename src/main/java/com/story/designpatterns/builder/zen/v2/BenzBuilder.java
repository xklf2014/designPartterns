package com.story.designpatterns.builder.zen.v2;

import com.story.designpatterns.builder.zen.v1.BenzModel;
import com.story.designpatterns.builder.zen.v1.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }
}
