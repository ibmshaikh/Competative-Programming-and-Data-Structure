package com.ibm.cp.List;


import java.util.*;
import java.util.stream.IntStream;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,1,8,3,5,4};
        int n = 4;
        IntStream a = Arrays.stream(arr).sorted();


        int[] finalArray = a.toArray();
        int startPos = finalArray.length -n;
        for (int i = startPos; i <finalArray.length ; i++) {
            System.out.println(finalArray[i]);
        }

    }
}
