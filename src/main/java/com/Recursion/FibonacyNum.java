package com.Recursion;

import java.util.*;

public class FibonacyNum {

    static long fibo(long n) {
        if (n < 2L)
            return n;
        return fibo(n - 1L) + fibo(n - 2L);
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input   :::  ");
            long input = sc.nextLong();
            System.out.println(input + " th Fibonacy Numer :::  " + fibo(input));
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
