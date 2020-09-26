package com.story.designpatterns.strategy.zen;

//计谋有了，那还要有锦囊
public class Context {
    private IStrategy strategy;
    //构造函数，你要使用那个妙计
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate(){
        strategy.operate();
    }
}
