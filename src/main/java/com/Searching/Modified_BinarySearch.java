package com.Searching;

import java.util.*;

public class Modified_BinarySearch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
            System.out.println("Enter Target");
            int target = sc.nextInt();
            ModifiedBinarySearch_UnsortedArr obj = new ModifiedBinarySearch_UnsortedArr();
            int n = arr.length;
            int result = obj.binarySearch(arr, 0, n - 1, target);
            if (result == -1)
                System.out.println("Element is not present in array");
            else
                System.out.println("Element is present at index " + result);
            sc.close();
        } catch (Exception e) {
            return;
        }
    }
}

class ModifiedBinarySearch_UnsortedArr {
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at
            // one of the middle 3 positions
            if (arr[mid] == x)
                return mid;
            if (mid > l && arr[mid - 1] == x)
                return (mid - 1);
            if (mid < r && arr[mid + 1] == x)
                return (mid + 1);

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 2, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 2, r, x);
        }

        // We reach here when element is
        // not present in array
        return -1;
    }
}