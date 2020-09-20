package com.story.designpatterns.iterator.v5;

public class LinkedList_<E> implements Collection_<E> {
    Node head = null;
    Node tail = null;
    private int size = 0;

    @Override
    public void add(E o) {
        Node node = new Node(o);
        node.next = null;

        if (head == null) {
            head = node;
            tail = node;
        }

        tail.next = node;
        tail = node;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator_ iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator<E> implements Iterator_<E> {
        int cursor = 0;
        @Override
        public boolean hasNext() {
           if (cursor++ != size) return true;
           return false;
        }

        @Override
        public E next() {
            Node result = null;
            result = head;
            head = head.next;
            return (E) result;
        }
    }

    private class Node<E> {
        E value;
        Node next;

        public Node(E value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }
}
