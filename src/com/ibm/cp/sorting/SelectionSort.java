package com.ibm.cp.sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = new int[]{11, 25, 12, 22, 64
        };
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int num :
                array) {
            System.out.println(num);

        }

    }
}
