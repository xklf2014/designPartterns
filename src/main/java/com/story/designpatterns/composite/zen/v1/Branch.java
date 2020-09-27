package com.story.designpatterns.composite.zen.v1;

import java.util.ArrayList;

public class Branch implements IBranch {
    private ArrayList subOrdinateList = new ArrayList();
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info += "名称:"+this.name;
        info += "\t职位:"+this.position;
        info += "\t薪水:" +this.salary;
        return info;
    }

    @Override
    public void add(IBranch branch) {
        this.subOrdinateList.add(branch);
    }

    @Override
    public void add(ILeaf leaf) {
        this.subOrdinateList.add(leaf);
    }

    @Override
    public ArrayList getSubOrdinateInfo() {
        return this.subOrdinateList;
    }
}
