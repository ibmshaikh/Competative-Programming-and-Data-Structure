package com.ibm.cp.List;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println(reverseArray(list));

    }

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> ab = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            ab.add(a.get(a.size()-i-1));
        }
        return ab;

    }
}
