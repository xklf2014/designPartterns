package com.story.designpatterns.visitor.zen.v4;

public abstract class Employee {
    public final static int MALE = 0;
    public final static int FEMALE = 1;
    private String name;
    private int salary;
    private int gender;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getGender() {
        return gender;
    }

    public abstract void accept(IVisitor visitor);
}
