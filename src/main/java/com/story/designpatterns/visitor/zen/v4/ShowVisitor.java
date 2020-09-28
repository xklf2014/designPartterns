package com.story.designpatterns.visitor.zen.v4;


public class ShowVisitor implements IShowVisitor {
    private String info = "";

    @Override
    public void report() {
        System.out.println(this.info);
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.info += this.getBasicInfo(commonEmployee) + "工作:" + commonEmployee.getJob() + "\n";
    }

    @Override
    public void visit(Manager manager) {
        this.info += this.getBasicInfo(manager) + "业绩:" + manager.getPerformance() + "\n";
    }

    private String getBasicInfo(Employee employee) {
        String info = "姓名:" + employee.getName() + "\t";
        info += "性别:" + (employee.getGender() == Employee.FEMALE ? "女性" : "男性") + "\t";
        info += "薪水:" + employee.getSalary() + "\t";
        return info;
    }
}
