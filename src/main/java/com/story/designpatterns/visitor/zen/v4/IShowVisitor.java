package com.story.designpatterns.visitor.zen.v4;

//负责展示报表的产生
public interface IShowVisitor extends IVisitor {
    public void report();
}
