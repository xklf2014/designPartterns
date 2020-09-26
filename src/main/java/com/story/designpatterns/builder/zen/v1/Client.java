package com.story.designpatterns.builder.zen.v1;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        BenzModel benz = new BenzModel();
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engineboom");
        sequence.add("start");
        sequence.add("stop");

        benz.setSequence(sequence);
        benz.run();
    }
}
