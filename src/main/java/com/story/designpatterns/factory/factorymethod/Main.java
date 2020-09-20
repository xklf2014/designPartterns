package com.story.designpatterns.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        /*Car c = new Car();
        c.go();*/
        Plane plane = new Plane();
        plane.go();
        System.out.println("=================");

        Movable movable = new Ship();
        movable.go();

        movable = new Broom();
        movable.go();
        System.out.println("=================");

        Movable m = new ShipFactory().createShip();
        m.go();
    }
}
