package com.story.designpatterns.decorator.zen.v1;


public class Father {
    public static void main(String[] args) {
        SchoolReport sr = new FouthGradeSchoolReport();
        sr.report();
        sr.sign("zhangsan");
    }
}
