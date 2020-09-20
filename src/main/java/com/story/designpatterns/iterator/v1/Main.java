package com.story.designpatterns.iterator.v1;

public class Main {
    public static void main(String[] args) {
        ArrayList_ list = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            list.add("str "+ i);
        }
        System.out.println(list.size());
    }
}

class ArrayList_{
    Object[] objects = new Object[10];
    private int index = 0;

    public void add(Object  o){
        if (index == objects.length){
            Object[] objects_new = new Object[objects.length << 1];
            System.arraycopy(objects,0,objects_new,0,objects.length);
            objects = objects_new;
        }

        objects[index] = o;
        index++;
    }

    public int size(){return index;}
}