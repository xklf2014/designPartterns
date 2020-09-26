package com.story.designpatterns.singleton.zen.v1;

//大臣是天天要面见皇帝，今天见的皇帝和昨天的，前天不一样那就出问题了！
public class Minister {

    public static void main(String[] args) {
        Emperor e1 = Emperor.getInstance();
        e1.emperprInfo();

        Emperor e2 = Emperor.getInstance();
        e2.emperprInfo();

        Emperor e3 = Emperor.getInstance();
        e3.emperprInfo();

        //三天见的皇帝都是同一个人，荣幸吧！
    }
}
