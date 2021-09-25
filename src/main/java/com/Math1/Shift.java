package com.Math1;

import java.util.Scanner;

public class Shift {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Num");
        long num= sc.nextLong();
        sc.close(); 
        System.out.println("       Num  :::  "+num );
        System.out.println(" Left Shift :::  "+(num<<2)); 
        System.out.println("Right Shift :::  "+(num>>2)); 
        System.out.println(); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
