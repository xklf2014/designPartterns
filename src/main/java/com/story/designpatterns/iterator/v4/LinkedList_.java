package com.story.designpatterns.iterator.v4;

public class LinkedList_ implements Collection_ {
    Node head = null;
    Node tail = null;
    private int size = 0;

    @Override
    public void add(Object o) {
        Node node = new Node(o);
        node.next = null;

        if (head == null){
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

    private class LinkedListIterator implements Iterator_ {
        int cursor = 0;
        @Override
        public boolean hasNext() {
            if (cursor++ != size) return true;
            return false;
        }

        @Override
        public Object next() {
            if (head == null){
                return null;
            }

            if (head.next != null){
                head = head.next;
            }
            return head;
        }

    }

    private class Node {
        Object value;
        Node next;

        public Node(Object value) {
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
