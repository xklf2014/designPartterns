package com.story.designpatterns.state.zen.v2;

public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        //电梯的初始条件应该是停止状态
        lift.setState(ILift.STOPPING_STATE);

        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
