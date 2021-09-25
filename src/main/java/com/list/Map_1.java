package com.list;

import java.util.HashMap;
import java.util.Map;

public class Map_1 {
    public static void main(String[] args) {
        try {
        Map <String,String> name = new HashMap<>();   
        name.put("1", "ami");
        name.put("2", "me");
        name.put("3", "myself");
        System.out.println(name); 

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
