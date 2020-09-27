package com.story.designpatterns.composite.zen.v4;


import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Branch ceo = compositeCorpTree();
        //System.out.println(ceo.getInfo());
        //System.out.println(getTreeInfo(ceo));
        Corp zhangsan = ((Branch) ceo.subOrdinateList.get(0)).subOrdinateList.get(0);
        //getParentInfo(zhangsan);
        //getAllParentInfo(zhangsan);
        getRootInfo(zhangsan);
    }


    public static Branch compositeCorpTree() {
        //首先产生了一个根节点
        Branch ceo = new Branch("王大麻子", "总经理", 100000);
        //产生三个部门经理，也就是树枝节点
        Branch devDep = new Branch("刘大瘸子", "研发经理", 30000);
        Branch salDep = new Branch("马二拐子", "销售经理", 20000);
        Branch financeDep = new Branch("赵三坨子", "财务经理", 50000);
        //再把2个小组长产生出来
        Branch firstDevGroup = new Branch("张三", "开发一组组长", 15000);
        Branch secondDevGroup = new Branch("李四", "开发二组组长", 13000);
        Leaf a = new Leaf("a", "开发人员", 2000);
        Leaf b = new Leaf("b", "开发人员", 2000);
        Leaf c = new Leaf("c", "开发人员", 2000);
        Leaf d = new Leaf("d", "开发人员", 2000);
        Leaf e = new Leaf("e", "开发人员", 2000);
        Leaf f = new Leaf("f", "开发人员", 2000);
        Leaf g = new Leaf("g", "开发人员", 2000);
        Leaf h = new Leaf("h", "销售人员", 5000);
        Leaf i = new Leaf("i", "销售人员", 4000);
        Leaf j = new Leaf("j", "财务人员", 5000);
        Leaf k = new Leaf("k", "CEO秘书", 8000);
        Leaf zhengLaoLiu = new Leaf("郑老六", "研发部副总", 50000);

        //该产生的人都产生出来了，然后我们怎么组装这棵树
        //首先是定义总经理下有三个部门经理
        ceo.addSubOrdinate(devDep);
        ceo.addSubOrdinate(salDep);
        ceo.addSubOrdinate(financeDep);
        ceo.addSubOrdinate(k);

        //定义研发部门 下的结构
        devDep.addSubOrdinate(firstDevGroup);
        devDep.addSubOrdinate(secondDevGroup);
        devDep.addSubOrdinate(zhengLaoLiu);

        firstDevGroup.addSubOrdinate(a);
        firstDevGroup.addSubOrdinate(b);
        firstDevGroup.addSubOrdinate(c);
        secondDevGroup.addSubOrdinate(d);
        secondDevGroup.addSubOrdinate(e);
        secondDevGroup.addSubOrdinate(f);
        secondDevGroup.addSubOrdinate(g);

        //再看销售部下的人员情况
        salDep.addSubOrdinate(h);
        salDep.addSubOrdinate(i);
        //最后一个财务
        financeDep.addSubOrdinate(j);
        return ceo;
    }

    public static String getTreeInfo(Branch root) {
        ArrayList<Corp> subOrdinateList = root.getSubOrdinate();
        String info = "";

        for (Corp corp : subOrdinateList) {
            if (corp instanceof Leaf) {
                info += corp.getInfo() + "\n";
            } else {
                info += corp.getInfo() + "\n" + getTreeInfo((Branch) corp);
            }
        }
        return info;
    }

    public static Corp getParentInfo(Corp corp){
        Corp parent = null;
        if (corp.getParent() != null){
            parent = corp.getParent();
            System.out.println(corp.getInfo() + "上级为:"+parent.getInfo());
        }
        return parent;
    }

    public static Corp getAllParentInfo(Corp corp){
        Corp parent = null;
        while(corp.getParent() != null){
            parent = corp.getParent();
            System.out.println(corp.getInfo() + "上级为:"+parent.getInfo());
            corp = parent;
        }
        return parent;
    }

    public static Corp getRootInfo(Corp corp){
        Corp ordinary = corp;
        Corp parent = null;
        while(corp.getParent() != null){
            parent = corp.getParent();
            corp = parent;
        }
        System.out.println(ordinary.getInfo() + "大老板为:"+parent.getInfo());
        return parent;
    }
}
