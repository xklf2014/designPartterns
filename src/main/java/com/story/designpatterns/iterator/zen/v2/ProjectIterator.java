package com.story.designpatterns.iterator.zen.v2;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {
    private ArrayList<IProject> projectList = new ArrayList<>();
    private int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        boolean flag = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) ==null){
            flag = false;
        }
        return flag;
    }

    @Override
    public IProject next() {
        return this.projectList.get(this.currentItem++);
    }
}
