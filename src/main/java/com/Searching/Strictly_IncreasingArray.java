package com.Searching;

public class Strictly_IncreasingArray {
    public static void main(String[] args) {
        try {
            int[] nums = { 1, 2,10, 3, 4, 5,10,6, 7, 8 };
            Solution_AB obc = new Solution_AB();
            System.out.println(obc.canBeIncreasing(nums));
        } catch (Exception e) {
            return;
        }
    }
}

class Solution_AB {
    public boolean canBeIncreasing(int[] nums) {
        int c = 0;
        for (int j = 0; j < nums.length-1; j++) {
            if (nums[j] > nums[j+1])
                c++;
        }
        if (c == 0 || c ==1)
            return true;
        else
            return false;
    }
}