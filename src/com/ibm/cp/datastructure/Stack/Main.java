package com.ibm.cp.datastructure.Stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        com.ibm.cp.datastructure.Stack.Stack stack = new com.ibm.cp.datastructure.Stack.Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());


    }

    private String reverseString(String str){
        Stack<Character> stack = new Stack<>();
        for (char chara :str.toCharArray()) {
            stack.push(chara);
        }
        StringBuilder buffer = new StringBuilder();
        while(!stack.isEmpty())
            buffer.append(stack.pop());
        return buffer.toString();
    }
}
