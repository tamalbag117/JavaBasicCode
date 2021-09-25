package com.sort;

import java.util.*;

public class Bubble_Sort_Algo {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner (System.in);
        System.out.print("Array size   ----> ");
        int s=sc.nextInt();
        long []arr =new  long[s];
        System.out.print("Array elements ---->  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextLong();
        }
        System.out.println("   Old Array is : "+Arrays.toString(arr));
        Bubble oc = new Bubble();
        long ans[]=oc.bubble(arr);
        System.out.println("Sorted Array is : "+Arrays.toString(ans));

        sc.close();   
        } catch (Exception e) {
        return;
        }
    }
}
class Bubble{
     public long[] bubble (long[]num){
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length-i-1; j++) {
            if(num[j+1]<num[j]){
                long temp = num[j];
                num[j]=num[j+1];
                num[j+1]=temp;
            }   
            }
        }
         return num;
     }
}