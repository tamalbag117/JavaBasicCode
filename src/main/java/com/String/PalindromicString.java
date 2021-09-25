package com.String;

import java.util.*;

public class PalindromicString {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner(System.in); 
        String str = sc.next();
        System.out.println("is The String Palindrom ? \n \n Ans --->  "+isPalindrom(str));
        sc.close();   
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    static boolean isPalindrom(String s){
        if(s == null ||s.length()==0)return true;
        s = s.toLowerCase();
        for (int index = 0; index <= s.length()/2; index++) {
        char start = s.charAt(index);
        char end = s.charAt(s.length()-1-index);
        if(start!=end){
            return false;
        }

        }
        return true;
    }
}
