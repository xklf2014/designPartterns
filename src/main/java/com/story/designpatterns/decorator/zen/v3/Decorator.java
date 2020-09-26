package com.story.designpatterns.decorator.zen.v3;

import com.story.designpatterns.decorator.zen.v1.SchoolReport;

//装饰类，我要把我的成绩单装饰一下
public abstract class Decorator extends SchoolReport {
    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
