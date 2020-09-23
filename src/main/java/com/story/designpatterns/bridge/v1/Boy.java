package com.story.designpatterns.bridge.v1;

public class Boy {
    public void chase(Girl girl){
        Gift gift = new Book();
        gave(girl,gift);
    }

    public void gave(Girl girl,Gift gift){
        System.out.println("送给女孩"+girl.name + gift);

    }
}
