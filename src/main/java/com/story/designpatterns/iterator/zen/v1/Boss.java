package com.story.designpatterns.iterator.zen.v1;

import java.util.ArrayList;

//老板来看项目信息了
public class Boss {
    public static void main(String[] args) {
        ArrayList<IProject> projectList = new ArrayList<>();

        projectList.add(new Project("星球大战项目", 1, 100000));
        projectList.add(new Project("扭转时空项目", 100, 1000000));
        projectList.add(new Project("超人改造项目", 10000, 100000000));

        //这边还有100个项目于
        for (int i = 3; i < 103; i++) {
            projectList.add(new Project("第" + i + "个项目", i * 5, i * 100000));
        }

        for (IProject project : projectList ) {
            System.out.println(project.getProjectInfo());
        }
    }
}
