package com.ibm.cp.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {
        List<Integer> m = new ArrayList<>(Arrays.asList(1, 2, 3));
        countSwaps(m);

    }

    public static void bubbleSort() {
        int[] array = new int[]{8, 2, 4, 1, 3};
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int num :
                array) {
            System.out.println(num);
        }
    }


    public static void countSwaps(List<Integer> a) {
        // Write your code here

        int noOfSwaps = 0;
        int temp;

        for (int i = 0; i < a.size(); i++) {

            for (int j = 0; j < a.size() - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j + 1)) {
                    System.out.println("Comming here");
                    temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                    noOfSwaps++;
                }
            }

        }
        System.out.println("Array is sorted in " + noOfSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(a.size() - 1));


    }


}
