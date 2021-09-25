package com.Node;

// build node class 
class Node{
    int data;
    Node next;
}


// main class 


public class SinglyLinkedList {
    public static void main(String[] args) {
        try {
        NodeList list = new NodeList();  
        list.ins(1); 
        list.ins(11);
        list.ins(111);
        list.ins(1111);
        list.ins(11111);
        list.ins(111111);
        list.ins(1111111);
        list.show();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
