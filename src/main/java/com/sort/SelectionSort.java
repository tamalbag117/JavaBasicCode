package com.sort;

import java.util.*;
public class SelectionSort {
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
        SelectionAlgo oc = new SelectionAlgo();
        long ans[]=oc.select_sort(arr);
        System.out.println("Sorted Array is : "+Arrays.toString(ans));
        sc.close();   
        } catch (Exception e) {
        return;
        }
    }
}
class SelectionAlgo{
    public long []select_sort(long []nums){
        for (int i = 0; i < nums.length-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < nums.length; j++)
                if (nums[j] < nums[min_idx])
                    min_idx = j;
            long temp = nums[min_idx];
            nums[min_idx] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}