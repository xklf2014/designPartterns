package com.story.designpatterns.strategy;

@FunctionalInterface
public interface Compartor_<T>{
    int compareTo(T o1,T o2);
}
