package com.story.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        //TerrainBuilder tb = new ComplexTerrainBuilder();
        //Terrain t = tb.buildFort().buildMine().buildWall().build();

        Person p = new Person.PersonBuilder().buildBasicInfo(1,"zhangsan",10).buildWeight(70).build();
        System.out.println(p.toString());
        Person p1 = new Person.PersonBuilder().buildBasicInfo(1,"zhangsan",10).buildWeight(70)
                .buildScore(80).buildLoc("center street","1001").build();
        System.out.println(p1.toString());
    }
}
