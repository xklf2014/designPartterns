package com.story.designpatterns.iterator.v5;

public class Main {
    public static void main(String[] args) {
        Collection_<String> c1 = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            c1.add(new String("s" + i));
        }
        System.out.println(c1.size());
        Iterator_<String> iterator = c1.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }

        Collection_<Integer> c2 = new LinkedList_<>();
        for (int i = 0; i < 15; i++) {
            c2.add(i);
        }
        System.out.println(c2.size());

        Iterator_ i2 = c2.iterator();
        while (i2.hasNext()){
            Object next = i2.next();
            System.out.println(next);
        }

    }
}
