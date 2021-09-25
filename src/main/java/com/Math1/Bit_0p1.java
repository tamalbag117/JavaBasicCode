package com.Math1;

import java.util.Scanner;

public class Bit_0p1 {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);

        System.out.println("compliment  ====>>>>");
        int a = 101;
        System.out.println("Ans :::  "+(~a));
        // System.out.println("Num a : ");
        // int a = sc.nextInt();
        // System.out.println("Num a : ");
        // int b = sc.nextInt();
        System.out.println(" j   ^   k   ^    j   === ans");
        for (int i = 2; i <= 14; i++) {
            boolean l =false;
            boolean j =false;
            boolean k =false;
        if(i%2==0){
             j =true;
             k =false;
        }else if(i%3==0){
           l=true;
        }
        else {
             j =false;
             k =false;
        } 
        System.out.println(j+"  ^  "+k+"   ^  "+l+"==="+(j^k^l));  
        }
        // System.out.println("ANS   :::  "+(a&b));
        sc.close();   
        } catch (Exception e) {
         System.out.println(e);
        }
    }
}
