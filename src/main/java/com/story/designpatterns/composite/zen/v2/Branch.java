package com.story.designpatterns.composite.zen.v2;

import java.util.ArrayList;

public class Branch implements ICorp, IBranch {
    private String name = "";
    private String position = "";
    private int salary = 0;

    ArrayList<ICorp> subOrdinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void addSubOrdinate(ICorp corp) {
        this.subOrdinateList.add(corp);
    }

    @Override
    public ArrayList<ICorp> getSubOrdinate() {
        return this.subOrdinateList;
    }

    @Override
    public String getInfo() {
        String info = "";
        info = "姓名：" + this.name;
        info = info + "\t职位："+ this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
}
