package com.story.designpatterns.visitor.zen.v3;

public class Visitor implements IVisitor {

    private final static int MANAGER_COEFFICIENT = 5;

    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;

    private int commTotalSalary = 0;
    private int managerTotalSalary = 0;

    public void visit(CommonEmployee commonEmp) {
        System.out.println(this.getCommonEmployee(commonEmp));
        this.calCommonSlary(commonEmp.getSalary());
    }

    public void visit(Manager mgr) {
        System.out.println(this.getManagerInfo(mgr));
        this.calManagerSalary(mgr.getSalary());
    }

    private String getBasicInfo(Employee emp) {
        String info = "姓名:" + emp.getName() + "\t";
        info += "性别:" + (emp.getGender() == Employee.FEMALE ? "女性" : "男性") + "\t";
        info += "薪水:" + emp.getSalary() + "\t";

        return info;
    }

    private String getManagerInfo(Manager mgr) {
        String basicInfo = this.getBasicInfo(mgr);
        String otherInfo = "业绩:" + mgr.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    private String getCommonEmployee(CommonEmployee commonEmp) {
        String basicInfo = this.getBasicInfo(commonEmp);
        String otherInfo = "工作:" + commonEmp.getJob() + "\t";
        return basicInfo + otherInfo;
    }

    private void calManagerSalary(int salary) {
        this.managerTotalSalary += salary * MANAGER_COEFFICIENT;
    }

    private void calCommonSlary(int salary) {
        this.commTotalSalary += salary * COMMONEMPLOYEE_COEFFICIENT;
    }

    @Override
    public int getTotalSalary() {
        return commTotalSalary + managerTotalSalary;
    }
}
