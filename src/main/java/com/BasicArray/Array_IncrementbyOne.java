package com.BasicArray;

import java.util.Arrays;

public class Array_IncrementbyOne {
    public static void main(String[] args) {
        int[] att ={1,2,3,4};
    OnePlusReturn obj = new OnePlusReturn();
    int []ans = obj.plusOne(att);
    System.out.println("Ans  :"+Arrays.toString(ans));
    }
}
class OnePlusReturn{
    public int [] plusOne(int [] digits ){
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
            if (i == 0) {
                int a[] = new int[digits.length + 1];
                a[0] = 1;
                return a;
            }
        }
        return digits;
    }
}