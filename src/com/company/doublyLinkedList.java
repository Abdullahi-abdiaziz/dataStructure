package com.company;

public class doublyLinkedList {

    Node head;
    Node tail;

    public void insertFirst(int val) {

        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node last = head;
        while (last.next != null) {
            last = last.next;
            tail = last;
        }
        Node node = new Node(val);
        node.prev = tail;
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
    }

    public void insert(int after , int value) {
        Node current = find(after);
        if (current == null){
            System.out.println("does not exists");
            return;
        }
        Node node = new Node(value);
        node.next = current.next;
        node.prev = current;
        current.next = node;
        if (node.next != null) {
            node.next.prev = node ;
        }
    }

    public Node find(int value) {
        Node node = head;
        while(node!=null) {
            if (node.val==value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node node = head;
        while (node != null){
            System.out.print(node.val+" -> ");
            //tail = node;
            node = node.next;
        }
        System.out.println("null");
    }

    public void displayRev() {
        Node node = tail;
        while (node != null){
            System.out.print(node.val+" -> ");
            node = node.prev;
        }
        System.out.println("null");
    }

    private class Node {

        private int val;
        private Node next;
        private Node prev;


        public Node(int val) {
            this.val = val;
        }
        public  Node(int val , Node next , Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
