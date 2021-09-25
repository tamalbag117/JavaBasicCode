package com.Searching;

import java.util.LinkedList;

public class Array_LinearSearch {
    public static void main(String[] args)throws Exception {
        try {
            LinkedList <String>myNameList = new LinkedList<>();
            myNameList.add("Anirban");
            myNameList.add("Miko");
            myNameList.add("Parthiv");
            myNameList.add("Rangan");
            myNameList.add("Lucifer");
            myNameList.add("UkNk");
            
            String name = "Anirban";
            System.out.println(myNameList.indexOf(name));

            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
