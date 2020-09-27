package com.story.designpatterns.chainofresponsibitily.zen.v1;

public interface IWomen {
    //获得个人状况
    public int getType();

    //获得个人请示，你要干什么？出去逛街？
    public String getRequest();
}
