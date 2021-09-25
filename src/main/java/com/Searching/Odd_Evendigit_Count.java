/* count odd even number of digits in a array */



package com.Searching;
import java.util.*;

public class Odd_Evendigit_Count {
    static int [] Odd_Even(int[] a,int s){
        int count =0;
        int flag =0;
        for (int i = 0; i < s;i++) {
         if (a[i]%2==0){
          count++;
         }else{
             flag++;
        }
        }
        return new int[]{count,flag};
    }
    public static void main(String[] args)throws Exception {
        try {
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter the size of the array :");
         int s= sc.nextInt();
         int [] arr = new int [s];
         System.out.println("Enter the array elements : ");
         for (int i = 0; i < s; i++) {
          arr[i]=sc.nextInt(); 
         }
         System.out.println("Array is : "+ Arrays.toString(arr));
        int []ans = Odd_Even(arr, s);
        sc.close();
        System.out.print("Total number of even and odd number present : ");
        System.out.println(Arrays.toString(ans));
        } catch (Exception e) {
        return;
        }
    }
}
