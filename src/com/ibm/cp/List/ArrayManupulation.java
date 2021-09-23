package com.ibm.cp.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayManupulation {

    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 5, 3));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(4, 8, 7));
        ArrayList<Integer> c = new ArrayList<>(Arrays.asList(6, 9, 1));

        arr.add(a);
        arr.add(b);
        arr.add(c);

        System.out.println(arrayManipulation(10, arr));

    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {

        long[] finalList = new long[n + 2];

        for (int i = 0; i < queries.size(); i++) {
            int start = queries.get(i).get(0);
            int end = queries.get(i).get(1);
            int value = queries.get(i).get(2);
            finalList[start] += value;
            finalList[end + 1] -= value;
        }
        return finMax(finalList);
    }

    private static long finMax(long[] finalList) {

        long max = Long.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < finalList.length; i++) {
            sum+=finalList[i];
            max = Math.max(max, sum);

        }
        return max;

    }

    //complexity is m*n
    public static long arrayManipulationmxn(int n, List<List<Integer>> queries) {
        // Write your code here
        long largest = 0;
        List<List<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            int start = queries.get(i).get(0) - 1;
            int end = queries.get(i).get(1) - 1;
            int value = queries.get(i).get(2);

            List<Integer> list = new ArrayList<>(Collections.nCopies(queries.size() - 1, 0));

            for (int j = 0; j < n; j++) {
                if (j >= start && j <= end) {

                    if (i != 0)
                        list.add(finalList.get(i - 1).get(j) + value);
                    else
                        list.add(value);
                } else {
                    if (i != 0) {
                        list.add(finalList.get(i - 1).get(j));
                    }

                }
                System.out.println(list.get(j));
                if (list.get(j) > largest)
                    largest = list.get(j);
            }
            finalList.add(list);
        }

        return largest;
    }

}
