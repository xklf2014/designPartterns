package com.story.designpatterns.command.zen.v2;

import com.story.designpatterns.command.zen.v1.CodeGroup;
import com.story.designpatterns.command.zen.v1.PageGroup;
import com.story.designpatterns.command.zen.v1.RequirementGroup;

//命令的抽象类，我们把客户发出的命令定义成一个一个的对象
public abstract class Command {
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();
}
