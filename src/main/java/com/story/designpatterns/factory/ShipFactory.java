package com.story.designpatterns.factory;

public class ShipFactory {
    public Moveable createShip(){
        System.out.println("a ship created");
        return new Ship();
    }
}
