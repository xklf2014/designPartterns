package com.story.designpatterns.decorator.zen.v3;

import com.story.designpatterns.decorator.zen.v1.SchoolReport;

//学校排名的情况汇报
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort(){
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();

    }
}
