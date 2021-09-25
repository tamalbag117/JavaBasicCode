package com.example.demo;

import java.util.Scanner;

public class ODDDDDd {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner (System.in);
        String a=sc.next(),b=sc.next(),c=sc.next(),d=sc.next();
        sc.close();
        long ans = Integer.parseInt(a)+Integer.parseInt(b)+Integer.parseInt(c)+Integer.parseInt(d);
        System.out.println("Ans : "+ans);
        System.out.println("Ans : "+(ans+1000));
        System.out.println(Long.toString(ans)+1000);
        } catch (Exception e) {
        System.out.println(e);
        }
    }
}
