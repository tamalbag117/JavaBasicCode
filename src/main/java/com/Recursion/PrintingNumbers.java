package com.Recursion;

import java.util.Scanner;

public class PrintingNumbers {
    static long wasNum(long n){
        long num=1L;
        if (num==n){
            return num;
        }else {
            System.out.println(n);
        return wasNum(n-1L);
        }
    }
public static void main(String[] args) {
    try {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Range :::   ");
    long  t = sc.nextLong();
    System.out.println(wasNum(t));
    sc.close();
    } catch (Exception e) {
        System.out.println(e);
    }
}
}
