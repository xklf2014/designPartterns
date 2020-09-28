package com.story.designpatterns.visitor.zen.v4;


public class TotalVisitor implements ITotalVisitor {
    //部门经理的工资系数是5
    private final static int MANAGER_COEFFICIENT = 5;
    //员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
    //普通员工的工资总和
    private int commonTotalSalary = 0;
    //部门经理的工资总和
    private int managerTotalSalary = 0;


    @Override
    public void totalSalary() {
        System.out.println("本公司的月工资总额是" + (this.commonTotalSalary +
                this.managerTotalSalary));
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.commonTotalSalary += commonEmployee.getSalary() * COMMONEMPLOYEE_COEFFICIENT;
    }

    @Override
    public void visit(Manager manager) {
        this.managerTotalSalary += manager.getSalary() * MANAGER_COEFFICIENT;
    }
}
