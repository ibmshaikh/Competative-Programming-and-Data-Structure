package com.ibm.cp.string;

public class HCF {

    public static void main(String[] args) {
        int count=0;
        int size = 7;
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                count++;
            }
        }
        System.out.println(count);
    }
}
