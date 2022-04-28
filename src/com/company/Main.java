package com.company;
public class Main {
    public static void main(String[] args) {

        System.out.println("------------------Singly LinkedList----------------");

        singlyLinkedList list1=new singlyLinkedList();

        list1.insertFirst(13);
        list1.insertFirst(2);
        list1.insertFirst(6);
        list1.insertFirst(21);
        list1.insertLast(99);
        list1.insert(10,3);
        list1.display();

        System.out.println(list1.deleteFirst());
        list1.display();

        System.out.println(list1.deleteLast());
        list1.display();

        System.out.println(list1.delete(2));
        list1.display();

        System.out.println(list1.find(13));

        System.out.println("--------------Doubly LinkedList----------------");

        doublyLinkedList list = new doublyLinkedList();

        list.insertFirst(13);
        list.insertFirst(2);
        list.insertFirst(6);
        list.insertFirst(21);
        list.display();
        list.insertLast(25);
        list.insertLast(33);
        list.insert(25,33);
        list.display();
        list.displayRev();

        System.out.println("--------------Circular LinkedList----------------");

        circularLinkedList list2 = new circularLinkedList();

        list2.insert(13);
        list2.insert(2);
        list2.insert(6);
        list2.insert(21);
        list2.display();
        list2.delete(6);
        list2.display();

    }
}