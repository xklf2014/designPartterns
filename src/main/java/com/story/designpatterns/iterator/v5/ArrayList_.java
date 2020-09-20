package com.story.designpatterns.iterator.v5;

public class ArrayList_<E> implements Collection_<E> {
    E[] arrs = (E[]) new Object[10];
    private int index = 0;

    @Override
    public void add(E e) {
        if (index >= arrs.length) {
            E[] arrs_new = (E[]) new Object[arrs.length << 1];
            System.arraycopy(arrs, 0, arrs_new, 0, arrs.length);
            arrs = arrs_new;
        }

        arrs[index++] = e;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator_ iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator<E> implements Iterator_<E> {
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex >= index) return false;
            return true;
        }

        @Override
        public E next() {
            E e = (E) arrs[currentIndex++];
            return e;
        }
    }
}
