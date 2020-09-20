package com.story.designpatterns.iterator.v2;

public class Main {
    public static void main(String[] args) {
        LinkedList_ linkedList = new LinkedList_();
        for (int i = 0; i < 15; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList.size());
    }
}

class LinkedList_{
    Node head = null;
    Node tail = null;

    private int size = 0;

    public void add(Object obj){
        Node node = new Node(obj);
        node.next = null;

        if (head == null){
            head = node;
            tail = node;
        }

        tail.next = node;
        tail = node;
        size++;
    }

    public int size(){return size;}


    private class Node{
        private Object value;
        Node next;

        public Node(Object value) {
            this.value = value;
        }


    }
}
