/*Given an integer array nums of length n, 
you want to create an array ans of length 2n 
where ans[i] == nums[i] and ans[i + n] == nums[i]
 for 0 <= i < n (0-indexed).
 
 Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]

 */
package com.BasicArray;
import java.util.*;
public class Array_Concatination {
 public static void main(String[] args) {
     try {
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter array size : ");
      int s =sc.nextInt();
      int []arr=new int [s];
      System.out.println("Enter array elements :");
      for (int i = 0; i < arr.length; i++) {
          arr[i]=sc.nextInt();
      }
   Solution_Array_Concat_1A obj = new Solution_Array_Concat_1A();
   int []ans=obj.getConcatenation(arr);
   System.out.println("After concatination : "+Arrays.toString(ans));
   sc.close();
     } catch (Exception e) {
         return;
     }
 }   
}
class Solution_Array_Concat_1A {
    public int[] getConcatenation(int[] nums) {
     int[] a = new int[nums.length * 2];
        
        for (int i = 0, j = nums.length; i < nums.length; i++, j++) {
            a[i] = nums[i];
            a[j] = nums[i];
        }
        return a;   
    }
}