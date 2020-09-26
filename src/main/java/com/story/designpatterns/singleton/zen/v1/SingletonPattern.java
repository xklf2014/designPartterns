package com.story.designpatterns.singleton.zen.v1;

public class SingletonPattern {
    private static final SingletonPattern singletonPattern = new SingletonPattern();

    private SingletonPattern(){

    }
    //直接 new 一个对象传递给类的成员变量 singletonpattern，你要的时候 getInstance（）直接返回给
    //你，解决问题！
    public synchronized static SingletonPattern getInstance(){
        return singletonPattern;
    }
}
