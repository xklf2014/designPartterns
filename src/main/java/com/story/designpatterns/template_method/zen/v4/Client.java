package com.story.designpatterns.template_method.zen.v4;

public class Client {
    public static void main(String[] args) {
        HummerModel h2 = new HummerH2Model();
        h2.run();

        HummerH1Model h1 = new HummerH1Model();
        h1.setAlarmFlag(true);
        h1.run();
    }
}
