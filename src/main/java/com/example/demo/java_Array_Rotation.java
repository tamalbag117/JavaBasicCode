/* Here we have to a array :
like [7,6,5,4,3,2,1] is a array after rotating by 2
the array become [5,4,3,2,1,7,6]


Time complexity : O(n)
space complexity : O(n)
*/

package com.example.demo;

public class java_Array_Rotation {
     /*Function to left rotate arr[] of size n by d*/
     void leftRotate(int arr[], int d, int n)
     {
         for (int i = 0; i < d; i++)
             leftRotatebyOne(arr, n);
     }
  
     void leftRotatebyOne(int arr[], int n)
     {
         int i, temp;
         temp = arr[0];
         for (i = 0; i < n - 1; i++)
             arr[i] = arr[i + 1];
         arr[n-1] = temp;
     }
  
     /* utility function to print an array */
     void printArray(int arr[], int n)
     {
         for (int i = 0; i < n; i++)
             System.out.print(arr[i] + " ");
     }
  
     // Driver program to test above functions
     public static void main(String[] args)
     {
        java_Array_Rotation rotate = new java_Array_Rotation();
         int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
         rotate.leftRotate(arr, 2, 7);
         rotate.printArray(arr, 7);
     }
}
