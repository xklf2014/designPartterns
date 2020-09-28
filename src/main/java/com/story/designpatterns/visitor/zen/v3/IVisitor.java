package com.story.designpatterns.visitor.zen.v3;

public interface IVisitor {
    public void visit(CommonEmployee commonEmp);

    public void visit(Manager mgr);

    public int getTotalSalary();
}
