package com.story.designpatterns.factory.abstractfactory;

public class Main {
    public static void main(String[] args) {
        //创建具体工厂（每个具体工厂都是一个产品族）
        AbstractFactory factory = new ModernFactory();
        Food food = factory.createFood();
        food.eat();
        Vehicle vehicle = factory.createVehicle();
        vehicle.go();
        Weapon weapon = factory.createWeapon();
        weapon.shoot();

        System.out.println("==========================");
        AbstractFactory factory1 = new MagicFactory();
        Weapon weapon1 = factory1.createWeapon();
        weapon1.shoot();
        Vehicle vehicle1 = factory1.createVehicle();
        vehicle1.go();
        Food food1 = factory1.createFood();
        food1.eat();

    }
}
