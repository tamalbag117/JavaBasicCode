package com.sort;

import java.util.Collections;
import java.util.LinkedList;

public class MargeTwoSortedList {
    public static void main(String[] args) {
      try {
        LinkedList<Integer>n = new LinkedList<>();  
        LinkedList<Integer>m = new LinkedList<>(); 
        //First Linked List Element
        n.add(4);
        n.add(50);
        n.add(10);
        n.add(80);
        n.add(15);
        n.add(14);
        n.add(24);
        n.add(11);
        n.add(85);
        n.add(43);
        n.add(34);
        n.add(55);
        n.add(70);
        n.add(30);
        n.add(40);
        System.out.println("First List : "+n);
        //second linkedlist element
        m.add(11119);
        m.add(2);
        m.add(4);
        m.add(9);
        m.add(54321);
        m.add(7);
        m.add(5);
        m.add(6);
        m.add(1);
        m.add(888);
        m.add(4);
        m.add(3);
        m.add(9);
        m.add(9999);
        System.out.println("second List : "+m);
        Solution_MargeList_Sort obj = new Solution_MargeList_Sort();
        System.out.println("Sorted Marged List :" +obj.mergeTwoLists(n, m));

      } catch (Exception e) {
        System.out.println(e);
      }
    }
}
class Solution_MargeList_Sort {
    public LinkedList<Integer> mergeTwoLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        l1.addAll(l2);
        Collections.sort(l1);
        return l1;
    }
}