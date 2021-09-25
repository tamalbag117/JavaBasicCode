package com.list;

import java.util.LinkedList;

public class UnderFlowError {
    public static void main(String[] args) {
        try {
        LinkedList<Integer>my = new LinkedList<>();
        my.get(6);

        } catch (Exception e) {
         System.out.println(e);
        }catch(StackOverflowError e){System.out.println(e);}
    }
}
