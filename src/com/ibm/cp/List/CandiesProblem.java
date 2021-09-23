package com.ibm.cp.List;

import java.util.*;

public class CandiesProblem {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2,4,3,5,2,6,4,5));
        System.out.println(candies(list.size(), list));

    }

    public static long candies(int n, List<Integer> arr) {
        List<Integer> canidesList = new ArrayList<Integer>(Collections.nCopies(n, 1));

        for (int i = 0; i < n; i++) {

            if (i==0){
                if (arr.get(i)>arr.get(i+1)){
                    canidesList.set(i,canidesList.get(i+1)+1);
                }
            }else if (i==n-1){
                if (arr.get(i)>arr.get(i-1)){
                    canidesList.set(i,canidesList.get(i-1)+1);
                }
            }else {

                if (arr.get(i)> arr.get(i+1) || arr.get(i)>arr.get(i-1)){
                    if (arr.get(i)> arr.get(i-1)){
                        canidesList.set(i,canidesList.get(i-1)+1);

                    }else {
                        canidesList.set(i,canidesList.get(i+1)+1);
                    }

                }

            }
        }
        long sum=0;
        for (Integer integer : canidesList) {
            sum = sum + integer;
        }
        return sum;
        //return canidesList.stream().mapToLong(i -> i.longValue()).sum();
    }
}
