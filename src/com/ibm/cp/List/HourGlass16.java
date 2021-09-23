package com.ibm.cp.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HourGlass16 {

    //There are 16 hourglasses in array of size 6. An hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum. The array will always be 6x6.

    public static int hourglassSum(List<List<Integer>> arr) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.size() - 1; i++) {

            for (int j = 0; j < arr.get(i).size() - 1; j++) {
                if (i + 2 <= 5 && j + 2 <= 5) {
                    int upperSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                    int mid = arr.get(i + 1).get(j + 1);
                    int lowerSum = arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                    list.add(upperSum + mid + lowerSum);
                }
            }
        }

        return list.stream().max(Comparator.comparing(Integer::valueOf)).get();

    }
}
