package com.story.designpatterns.prototype.v1;

public class Main {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.println("p2.age="+p2.age+",p2.name="+p2.name);
        System.out.println("p2.loc="+p2.loc);
        //person内的引用为浅克隆
        System.out.println(p1.loc==p2.loc);
        p1.loc.street = "tianjin";
        System.out.println(p2.loc.street);
    }
}

class Person implements Cloneable{
    String name = "zhangsan";
    int age = 20;
    Location loc = new Location("shanghai",101);

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Location{
    String street;
    int roomNo;

    public Location(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }
}
