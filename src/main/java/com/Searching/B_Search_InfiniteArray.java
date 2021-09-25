package com.Searching;


import java.util.*;

public class B_Search_InfiniteArray {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
            System.out.println("Enter Target");
            int target = sc.nextInt();
            Binary_Search_1_A obj = new Binary_Search_1_A();
            int ans = obj.search_B(arr, target);
            System.out.println("Element found at index of : " + ans);
            sc.close();
        } catch (Exception e) {
            return;
        }
    } 
    
}


class Binary_Search_1_AB {
    public int search_B(int[] nums, int target) {
        var low = 0;
        var high = nums.length - 1;

        while (low <= high) {
            var mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
