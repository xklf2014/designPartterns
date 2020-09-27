package com.story.designpatterns.composite.zen.v3;

import java.util.ArrayList;

public class Branch extends Corp {
    ArrayList<Corp> subOrdinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubOrdinate(Corp corp){
        this.subOrdinateList.add(corp);
    }

    public ArrayList<Corp> getSubOrdinate(){
        return this.subOrdinateList;
    }
}
