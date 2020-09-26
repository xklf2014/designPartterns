package com.story.designpatterns.singleton.zen.v1;
//中国的历史上一般都是一个朝代一个皇帝，有两个皇帝的话，必然要PK出一个皇帝出来
public class Emperor {

    private static Emperor emperor = null;

    private Emperor(){
        //世俗和道德约束你，目的就是不让你产生第二个皇帝
    }

    public static Emperor getInstance(){
        if (emperor == null){ //如果皇帝还没有定义，那就定一个
            emperor = new Emperor();
        }
        return emperor;
    }

    public void emperprInfo(){
        System.out.println("我是皇帝" + System.identityHashCode(this));
    }


}
