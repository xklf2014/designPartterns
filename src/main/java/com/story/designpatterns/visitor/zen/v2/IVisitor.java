package com.story.designpatterns.visitor.zen.v2;

//访问者，我要去访问人家的数据了
public interface IVisitor {
    public void visit(CommonEmployee commonEmployee);

    public void visit(Manager manager);
}
