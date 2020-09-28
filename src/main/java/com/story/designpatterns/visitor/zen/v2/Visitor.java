package com.story.designpatterns.visitor.zen.v2;

public class Visitor implements IVisitor {
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    private String getBasicInfo(Employee emp) {
        String info = "姓名:" + emp.getName() + "\t";
        info += "性别:" + (emp.getGender() == Employee.FEMALE ? "女性" : "男性") + "\t";
        info += "薪水:" + emp.getSalary() + "\t";

        return info;
    }

    private String getManagerInfo(Manager mgr){
        String basicInfo = this.getBasicInfo(mgr);
        String otherInfo = "业绩:"+mgr.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    private String getCommonEmployee(CommonEmployee commonEmp){
        String basicInfo = this.getBasicInfo(commonEmp);
        String otherInfo = "工作:" + commonEmp.getJob() + "\t";
        return basicInfo + otherInfo;
    }
}
