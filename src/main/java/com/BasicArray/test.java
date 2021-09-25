package com.BasicArray;
import java.util.*;
public class test {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int ans =n%2;
            System.out.println(ans);
          sc.close();  
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
