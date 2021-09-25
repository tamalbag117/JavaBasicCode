package com.Searching;
import java.util.LinkedList;
import java.util.Scanner;

public class linear_Search_1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            LinkedList<Long> myNumberList = new LinkedList<>();
            System.out.println("Size of the array : ");
            int s = sc.nextInt();
            System.out.println("Enter the array element :");
            for (int i = 0; i < s; i++) {
                myNumberList.add(i, sc.nextLong());
            }
            System.out.println("Enter the Target");
            long targer = sc.nextLong();
            int ans = linearSearch_1(myNumberList, targer);
            if(ans == -1){
                System.out.println("no elemt found");
            }else {
                System.out.println("Element found at index of :" +ans);
            }
        sc.close();
        } catch (Exception e) {
            return;
        }
    }

static int linearSearch_1 (LinkedList<Long>list_1 ,long targer) {
if(list_1.size()==0){
    return -1;
}
for (int i = 0; i < list_1.size(); i++) {
    long element = list_1.get(i);
    if(element == targer){
        return i;
    }  
}
 return -1;
}
}
