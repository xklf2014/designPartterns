package com.story.designpatterns.decorator.zen.v2;

import com.story.designpatterns.decorator.zen.v1.SchoolReport;

public class Father {
    public static void main(String[] args) {
        SchoolReport sr = new SugarFouthGradeSchoolReport();
        sr.report();
        sr.sign("zhangsan");
    }
}
