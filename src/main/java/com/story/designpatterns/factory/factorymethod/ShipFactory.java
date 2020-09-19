package com.story.designpatterns.factory.factorymethod;

public class ShipFactory {
    public Moveable createShip(){
        System.out.println("a ship created");
        return new Ship();
    }
}
