package com.story.designpatterns.visitor.zen.v4;


public interface IVisitor {
    public void visit(CommonEmployee commonEmployee);

    public void visit(Manager manager);
}
