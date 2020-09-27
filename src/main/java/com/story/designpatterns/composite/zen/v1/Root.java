package com.story.designpatterns.composite.zen.v1;

import java.util.ArrayList;

//根节点的实现类
public class Root implements IRoot{
    //保存根节点下的树枝节点和树叶节点，Subordinate的意思是下级
    private ArrayList subOrdinateList = new ArrayList();
    //根节点的名称
    private String name = "";
    //根节点的职位
    private String position = "";
    //根节点的薪水
    private int salary = 0;

    public Root(String name, String position, int salary) {
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
