package com.story.designpatterns.iterator.v3;

public class Main {
    public static void main(String[] args) {
        Collection_ collection = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            collection.add(i);
        }
        System.out.println(collection.size());

        Collection_ collection1 = new LinkedList_();
        for (int i = 0; i < 15; i++) {
            collection1.add(i);
        }
        System.out.println(collection1.size());
    }
}
