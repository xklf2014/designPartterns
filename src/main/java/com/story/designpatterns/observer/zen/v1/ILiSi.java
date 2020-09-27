package com.story.designpatterns.observer.zen.v1;

//类似于李斯的这种人,监控者
public interface ILiSi {
    //一发现别人有动静，自己也要行动起来
    public void update(String context);
}
