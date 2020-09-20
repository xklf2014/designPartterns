package com.story.designpatterns.iterator.v4;

public class ArrayList_ implements Collection_ {
    Object[] objects = new Object[10];
    private int index = 0;

    @Override
    public void add(Object o) {
        if (index == objects.length){
            Object[] objects_new = new Object[objects.length << 1];
            System.arraycopy(objects,0,objects_new,0,objects.length);
            objects = objects_new;
        }

        objects[index++] = o;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator_ iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator_{
        private int currentIndex = 0;
        @Override
        public boolean hasNext() {
            if (currentIndex >= index) return false;
            return true;
        }

        @Override
        public Object next() {
            Object o = objects[currentIndex++];
            return o;
        }
    }
}
