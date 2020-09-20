package com.story.designpatterns.iterator.v5;

public interface Collection_<E> {
    void add(E e);
    int size();

    Iterator_ iterator();
}
