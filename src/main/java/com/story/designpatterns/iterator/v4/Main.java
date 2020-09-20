package com.story.designpatterns.iterator.v4;

public class Main {
    public static void main(String[] args) {
        Collection_ collection = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            collection.add(i);
        }
        System.out.println(collection.size());
        Iterator_ iterator = collection.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }

        Collection_ collection1 = new LinkedList_();
        for (int i = 0; i < 15; i++) {
            collection1.add(i);
        }
        System.out.println(collection1.size());

        Iterator_ iterator1 = collection1.iterator();
        while (iterator1.hasNext()){
            Object next = iterator1.next();
            System.out.println(next);
        }

    }
}
