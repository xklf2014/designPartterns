package com.story.designpatterns.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        /*Car c = new Car();
        c.go();*/
        Plane plane = new Plane();
        plane.go();
        System.out.println("=================");

        Moveable moveable = new Ship();
        moveable.go();

        moveable = new Broom();
        moveable.go();
        System.out.println("=================");

        Moveable m = new ShipFactory().createShip();
        m.go();
    }
}
