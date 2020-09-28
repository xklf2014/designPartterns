package com.story.designpatterns.visitor.zen.v4;

//负责统计报表的产生
public interface ITotalVisitor extends IVisitor {
    public void totalSalary();
}
