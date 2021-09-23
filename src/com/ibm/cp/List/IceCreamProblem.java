package com.ibm.cp.List;

import java.util.*;

public class IceCreamProblem {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        List<Integer> m = new ArrayList<>(Arrays.asList(1, 2, 3,4, 5, 6));
        List<Integer> ma = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            ma.add(i+1);
        }
        System.out.println("Size of array is: "+ma.size());
        whatFlavors(ma,199999999);

        //getSum(ma,199999);
        long endTime = System.currentTimeMillis();

        System.out.println("Took "+(endTime - startTime) + " ms");

    }

    static void whatFlavors(List<Integer> cost, int money) {
        int first = 0, second = 0;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        long startTime = System.currentTimeMillis();


        for (int i = 0; i < cost.size(); i++) {
            hashMap.put(cost.get(i),i);
        }
        for (int i = 0; i < cost.size(); i++) {
            int valueToFind = money-cost.get(i) ;

            if (hashMap.get(valueToFind)!=null ){
                if (hashMap.get(valueToFind)!=i) {
                    first = i;
                    second = hashMap.get(valueToFind);
                    break;
                }
            }

        }
        long endTime = System.currentTimeMillis();
        System.out.println("Took "+(endTime - startTime) + " ms");

        System.out.println(first+1 +" "+(second+1));
    }
    static void getSumOptimize(List<Integer> cost, int money) {
        int first = 0, second = 0;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < cost.size(); i++) {
            hashMap.put(cost.get(i),i);

        }

        for (int i = 0; i < cost.size(); i++) {
            int valueToFind = money-cost.get(i) ;

            if (hashMap.get(valueToFind)!=null ){
                if (hashMap.get(valueToFind)!=i) {
                    first = i;
                    second = hashMap.get(valueToFind);
                    break;
                }
            }

        }

        System.out.println(first+1 +" "+(second+1));
    }

    static void getSum(List<Integer> cost, int money) {
        int first = 0, second = 0;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < cost.size(); i++) {
            int valueToFind = money-cost.get(i) ;
            for (int j = 0; j < cost.size() - 1; j++) {

                if (valueToFind == cost.get(j)) {
                    first = i;
                    second = j;
                    break;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Took "+(endTime - startTime) + " ms");

        System.out.println(first+1 +" "+(second+1));
    }
}
