package com.Searching;

public class MaxSecondMaxWithOutSort {
    public static void main(String[] args) {
        try {
         int [] arr ={1,10,2,9,3,8,4,7,6,5};
         int max=Integer.MIN_VALUE;
         int sm = Integer.MIN_VALUE;
         int min=Integer.MAX_VALUE;
         int sn=Integer.MAX_VALUE;
         int k=0;
         int c=0;
         for(int i=0;i<arr.length;i++){
             if(arr[i]>max){
                 max=arr[i];
                k=i;}
         }
         System.out.println("Maximum Number in the Array : "+  max);
         arr[k]=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
         if(arr[i]>sm)sm= arr[i];  
         }
         System.out.println("Second Largest Element : "+ sm);
         for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
               c=i;}
        }
        System.out.println("Minimum Number in the Array : "+  min);
        arr[c]=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
        if(arr[i]<sn)sn= arr[i];  
        }
        System.out.println("Second Smallest Element : "+ sn);
        } catch (Exception e) {
            return ;
        }
    }
}
