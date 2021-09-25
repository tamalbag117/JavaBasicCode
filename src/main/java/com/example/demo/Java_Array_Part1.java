/* To ditermined maximum number in an array 
   
  at first initialize the first array elemet as largest elemet 
  then search in the array if any number is grater than the max value , 
  if that happens initialize it with max value.
  and return it to the main method.

  Time Complexity : worst case --> O(n)
  space complexity : O(n)
*/
package com.example.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Java_Array_Part1 {
    static double max_1(double[] arr1) {
        double maxx1 = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (maxx1 < arr1[i]) {
                maxx1 = arr1[i];
            }
        }
        return maxx1;
    }

    public static void main(String[] args) throws java.lang.Exception {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array : ");
            int s = sc.nextInt();
            double[] arr = new double[s];
            System.out.println("Enter the elemets of the  array : ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextDouble();
            }
            System.out.println("Now the array is :" + Arrays.toString(arr));
            System.out.println("Maximum elemet in the array is :" + max_1(arr));
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
