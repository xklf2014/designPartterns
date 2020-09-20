package com.story.designpatterns.iterator.v3;

public class LinkedList_ implements Collection_ {
    Node head = null;
    Node tail = null;
    private int size = 0;

    @Override
    public void add(Object o) {
        Node node = new Node(o);
        node.next = null;

        if (head ==null){
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

    private class Node{
        private Object value;
        Node next;

        public Node(Object value) {
            this.value = value;
        }
    }
}
