package com.number;

import java.util.Scanner;
class Ans_1{
    public int ans(int n){
        return n<=0||n>100?0:n>=1&&n<=49?100:50;
    }
}
public class TernaryOperator {
    public static void main(String[] args) {
    try {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Ans_1 obj = new Ans_1();
        int a =obj.ans(n); 
        System.out.println(a);
        sc.close();
    } catch (Exception e) {
     return;}
}
}
