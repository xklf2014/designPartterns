package com.story.designpatterns.dp02_strategy;

@FunctionalInterface
public interface Compartor_<T>{
    int compareTo(T o1,T o2);
}
