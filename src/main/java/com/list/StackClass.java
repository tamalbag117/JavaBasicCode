package com.list;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> name = new Stack<>();
        name.push("item");
        name.push("my name");
        name.push("s");
        System.out.println(name.capacity());
        System.out.println(name);
    }
}
