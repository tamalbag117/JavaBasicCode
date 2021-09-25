package com.String;

import java.util.Scanner;

public class NextvsNextLine {
    public static void main(String[] args) {
        try {
        Scanner sc = new Scanner (System.in);
        System.out.print("Your Name   :::   ");
        
        String  name = sc.nextLine();
         System.out.println("your name is ::: "+name);

        sc.close();   
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
