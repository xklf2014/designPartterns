package com.story.designpatterns.iterator.zen.v1;

public class Project implements IProject {
    //项目名称
    private String name;
    //项目成员数量
    private int num;
    //项目费用
    private int cost;

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public String getProjectInfo() {
        String info = "";
        info += "项目名称：" + this.name;
        info += "\t项目人数" + this.num;
        info += "\t项目费用" + this.cost;
        return info;
    }
}
