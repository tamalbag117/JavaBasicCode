package com.example;

import java.util.ArrayList;

import java.util.*;

public class AyyaRotation_1 {
    void Rotate_1(ArrayList<Integer> list1, int d) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            temp.add(i, list1.get(i));
        }
        for (int i = 0; i < list1.size() - d; i++) {
            list1.set(i, list1.get(i + d));
        }
        list1.addAll(temp);
    }

    void printArray(ArrayList<Integer> list1) {
        System.out.println(list1);
    }

    public static void main(String[] args) throws java.lang.Exception {
        try {
            Scanner sc = new Scanner(System.in);
            AyyaRotation_1 rotate = new AyyaRotation_1();
            ArrayList<Integer> myList = new ArrayList<>();
            System.out.println("Size of the array :");
            int size = sc.nextInt();

            System.out.println("Array Element : ");
            for (int i = 0; i < size; i++) {
                myList.add(sc.nextInt());
            }
            System.out.println(myList);
            System.out.println(" rotare from where :");
            int d = sc.nextInt();
            rotate.Rotate_1(myList, d);
            rotate.printArray(myList);
            sc.close();
        } catch (Exception e) {
            return;
        }
    }
}
