package com.Searching;

import java.util.*;


public class Odd_EvenChecking {
    public static void main(String[] args) {
        LinkedList<Integer>myNumberList = new LinkedList<>();
        Scanner sc =new Scanner (System.in);
        System.out.println("Sie of the list :");
        int size =sc.nextInt();
        for (int i = 0; i < size; i++) {
        myNumberList.add(i, sc.nextInt());    
        }
        System.out.println(myNumberList);
        int []ans = Odd_Even(myNumberList);
        sc.close();
        System.out.print("Total number of even and odd number present : ");
        System.out.println(Arrays.toString(ans));
    }
    static int[] Odd_Even(LinkedList<Integer>list){
        int count=0;
        int flag=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0)count++;
            else flag++;
        }
        return new int[]{count,flag};
    }
}
