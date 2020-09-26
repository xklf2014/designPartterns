package com.story.designpatterns.iterator.zen.v2;

public interface IProject {
    public void add(String name,int num,int cost);

    public String getProjectInfo();

    public IProjectIterator iterator();
}
