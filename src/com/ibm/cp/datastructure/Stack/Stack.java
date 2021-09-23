package com.ibm.cp.datastructure.Stack;

public class Stack {

    private int arr[] = new int[10];
    private int count = 0;

    public void push(int val) {

        if (count == 0) {
            arr[0] = val;
            count++;
        } else {
            arr[count] = val;
            count++;
        }
    }

    public int pop(){
        if (count==0){
            return 0;
        }else {
            int popVar = arr[count];
            arr[count] = 0;
            count--;
            return popVar;
        }
    }

    public int peek(){
        return arr[count-1];
    }

}
