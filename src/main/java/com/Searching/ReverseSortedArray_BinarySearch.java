package com.Searching;

import java.util.*;

public class ReverseSortedArray_BinarySearch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int[] arr = { 100, 98, 77, 66, 45, 32, 28, 25, 23, 24, 20, 19, 16, 12, 10, 7, 6, 5, 1, 0, -1, -3, -11,
                    -21,-35 };
            ReverseOrderSortedArr_BinarySearch obj = new ReverseOrderSortedArr_BinarySearch();
            System.out.print("Target element : ");
            int target = sc.nextInt();
            int ans = obj.searchIndexPosition(arr, target);
            System.out.println("Array Index is :  " + ans);
            sc.close();
        } catch (Exception e) {
            return;
        }
    }
}

class ReverseOrderSortedArr_BinarySearch {
    public int searchIndexPosition(int[] nums, int element) {
        var low = 0;
        var high = nums.length ;

        while (low <= high) {
            var mid = low + (high - low) / 2;
            if (nums[mid] == element)
                return mid;
            if (nums[mid] < element)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}