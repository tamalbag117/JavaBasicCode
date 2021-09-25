package com.Math1;


import java.util.*;


class Con{
    int con(int num,int k){
        int p=1,total=0;
        while(num!=0){
        int dig = num/k;
        num=num/k;
        total+=dig*p;
        p=p*10;
        }
        return total;
    }
}
public class NumConverter {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Decimal  Number & Base  ");
        int n=sc.nextInt(),b=sc.nextInt();
        Con obj = new Con();
        int ans = obj.con(n, b);
        System.out.println("The number is ---> "+ans);
        sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
