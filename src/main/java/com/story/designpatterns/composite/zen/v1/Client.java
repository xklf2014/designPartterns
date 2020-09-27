package com.story.designpatterns.composite.zen.v1;

import java.util.ArrayList;

//Client的作用是组装这棵树，并遍历一遍
@SuppressWarnings("all")
public class Client {
    public static void main(String[] args) {
        //首先产生了一个根节点
        IRoot ceo = new Root("王大麻子", "总经理", 100000);
        //产生三个部门经理，也就是树枝节点
        IBranch devDep = new Branch("刘大瘸子", "研发经理", 30000);
        IBranch salDep = new Branch("马二拐子", "销售经理", 20000);
        IBranch financeDep = new Branch("赵三坨子", "财务经理", 50000);
        //再把2个小组长产生出来
        IBranch firstDevGroup = new Branch("张三", "开发一组组长", 15000);
        IBranch secondDevGroup = new Branch("李四", "开发二组组长", 13000);
        ILeaf a = new Leaf("a", "开发人员", 2000);
        ILeaf b = new Leaf("b", "开发人员", 2000);
        ILeaf c = new Leaf("c", "开发人员", 2000);
        ILeaf d = new Leaf("d", "开发人员", 2000);
        ILeaf e = new Leaf("e", "开发人员", 2000);
        ILeaf f = new Leaf("f", "开发人员", 2000);
        ILeaf g = new Leaf("g", "开发人员", 2000);
        ILeaf h = new Leaf("h", "销售人员", 5000);
        ILeaf i = new Leaf("i", "销售人员", 4000);
        ILeaf j = new Leaf("j", "财务人员", 5000);
        ILeaf k = new Leaf("k", "CEO秘书", 8000);
        ILeaf zhengLaoLiu = new Leaf("郑老六", "研发部副总", 50000);

        //该产生的人都产生出来了，然后我们怎么组装这棵树
        //首先是定义总经理下有三个部门经理
        ceo.add(devDep);
        ceo.add(salDep);
        ceo.add(financeDep);
        ceo.add(k);

        //定义研发部门 下的结构
        devDep.add(firstDevGroup);
        devDep.add(secondDevGroup);
        devDep.add(zhengLaoLiu);

        firstDevGroup.add(a);
        firstDevGroup.add(b);
        firstDevGroup.add(c);
        secondDevGroup.add(d);
        secondDevGroup.add(e);
        secondDevGroup.add(f);
        secondDevGroup.add(g);

        //再看销售部下的人员情况
        salDep.add(h);
        salDep.add(i);
        //最后一个财务
        financeDep.add(j);

        //树状结构写完毕，然后我们打印出来
        System.out.println(ceo.getInfo());

        //打印出来整个树形
        getAllSubOrdinateInfo(ceo.getSubOrdinateInfo());
    }

    private static void getAllSubOrdinateInfo(ArrayList subOrdinateList){
        int len = subOrdinateList.size();
        for (int i = 0; i < len; i++) {
            Object o = subOrdinateList.get(i);
            if (o instanceof Leaf){
                ILeaf employee = (ILeaf) o;
                System.out.println(employee.getInfo());
            }else{
                IBranch branch = (IBranch) o;
                System.out.println(branch.getInfo());
                getAllSubOrdinateInfo(branch.getSubOrdinateInfo());
            }
        }
    }
}
