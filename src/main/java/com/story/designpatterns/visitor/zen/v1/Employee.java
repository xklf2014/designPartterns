package com.story.designpatterns.visitor.zen.v1;

public abstract class Employee {
    public final static int MALE = 0;
    public final static int FEMALE = 1;
    private String name;
    private int salary;
    private int gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public final void report() {
        String info = "姓名:" + this.name + "\t";
        info += "性别:" + (this.gender == FEMALE ? "女性" : "男性") + "\t";
        info += "薪水:" + this.salary + "\t";
        info += this.getOtherInfo();
        System.out.println(info);
    }

    protected abstract String getOtherInfo();
}
