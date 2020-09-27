package com.story.designpatterns.composite.zen.v2;

//Leaf是树叶节点，在这里就是我们这些小兵
public class Leaf implements ICorp {
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info += "姓名:" + this.name;
        info += "\t职位:" + this.position;
        info += "\t薪水:" + this.salary;
        return info;
    }
}
