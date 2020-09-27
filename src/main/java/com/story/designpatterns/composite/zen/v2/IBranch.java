package com.story.designpatterns.composite.zen.v2;

import java.util.ArrayList;

//这些下边有小兵或者是经理等风云人物
public interface IBranch {
    //能够增加小兵(树叶节点）或者是经理（树枝节点）
    public void addSubOrdinate(ICorp corp);

    //我还要能够获得下属的信息
    public ArrayList<ICorp> getSubOrdinate();
}
