package com.example;

import java.util.LinkedList;

public class TestDoulbt {
   public static void main(String[] args) {
       try {
           LinkedList<String> n =new LinkedList<>();
           n.add("HI");
           System.out.println(n.indexOf("HI"));
       } catch (Exception e) {
           //TODO: handle exception
       }
   } 
}
