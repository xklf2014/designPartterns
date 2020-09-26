package com.story.designpatterns.decorator.zen.v3;

import com.story.designpatterns.decorator.zen.v1.FouthGradeSchoolReport;
import com.story.designpatterns.decorator.zen.v1.SchoolReport;

//老爸看成绩单了
public class Father {
    public static void main(String[] args) {
        SchoolReport sr;

        sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("zhangsan");


    }
}
