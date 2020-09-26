package com.story.designpatterns.builder.zen.v2;

import com.story.designpatterns.builder.zen.v1.CarModel;

import java.util.ArrayList;

//要什么顺序的车，你说，我给建造出来
public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}
