/* Sum of all the array elemets :
like sum of [1,2,3]=1+2+3=6;
Time complexity : O(n)
*/
package com.example;

import java.util.ArrayList;
import java.util.Scanner;



public class Java_Array_Element_sum {
    long getSum(ArrayList<Long> list){
    long sum=0;
    for (int i = 0; i < list.size(); i++) {
        sum+=list.get(i);
    }     
    return sum;
    }
    public static void main(String[] args) {
      try {
      Scanner sc = new Scanner(System.in);  
      ArrayList<Long>myElemet_list = new ArrayList<>();
      System.out.println("size of the array :");
      int s =sc.nextInt();
      System.out.println("array Elements are : ");
      for (int i = 0; i < s; i++) {
          myElemet_list.add(sc.nextLong());
      }
      Java_Array_Element_sum obj =new Java_Array_Element_sum();
      System.out.println("The array is :" + myElemet_list);
      System.out.println("The sum of the array is :"+ obj.getSum(myElemet_list));
      sc.close();
      } catch (Exception e) {
          return;
      }  
    }
}
