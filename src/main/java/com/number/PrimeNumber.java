package com.number;

import java.util.*;


public class PrimeNumber {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Number --->  ");
        int num = sc.nextInt();
        sol b =new sol();
        sc.close();
        //checkprime ob = new checkprime();
        System.out.println("Number of prime numbers : "+b.count_Prime(num));
        } catch (Exception e) {
         return;
        }
    }
}
class checkprime{
    public int countPrime(int n){
        boolean[] primes = new boolean[n];
        for(int i = 0;i < n;i++) primes[i] = true;
        for(int i = 2;i*i <= n;i++) {
            if(primes[i]) {
                for(int j = i*2;j < n;j+=i) {
                    primes[j] = false;
                }
            }
        }
        int count = 0;
        for(int i = 2;i < n;i++) {
            if(primes[i]) count++;
        }
        return count;
    }
}
class sol{
    public boolean isPrime(int num){
        if(num==1||num==0)return false;
        int f=0;
        for (int i = 2; i <= num/2; i++) {
        if (num%i==0) {
         f=1;
         break;   
        }    
        }
        if (f==0) {
         return true;   
        }
        return false;   
    }
    public int count_Prime(int n){
        sol b =new sol();
        int c=0;
        for (int i = 2; i <= n; i++) {
        if (b.isPrime(i)==true) c++; 
        }
        return c;
    }

}