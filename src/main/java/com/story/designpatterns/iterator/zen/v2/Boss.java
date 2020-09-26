package com.story.designpatterns.iterator.zen.v2;

public class Boss {
    public static void main(String[] args) {
        IProject project = new Project();
        project.add("星球大战项目", 1, 100000);
        project.add("扭转时空项目", 100, 1000000);
        project.add("超人改造项目", 10000, 100000000);
        //这边还有100个项目于
        for (int i = 3; i < 103; i++) {
            project.add("第" + i + "个项目", i * 5, i * 100000);
        }

        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()){
            IProject pj = (IProject) projectIterator.next();
            System.out.println(pj.getProjectInfo());
        }

    }
}
