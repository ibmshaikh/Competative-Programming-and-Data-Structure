package com.ibm.cp.List;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

    public static void main(String[] args) {



    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here

        List<Integer> list = new ArrayList<>();

        Integer[] arr = new Integer[a.size()];
        arr = a.toArray(arr);



        for(int i=1;i<=d;i++){
            list = shiftLeft(a);
        }
        return list;
    }

    public static List<Integer> shiftLeft(List<Integer> list){
        int firstElement = list.get(0);


        for(int i=1;i<list.size();i++){
            list.set(i-1, list.get(i));
        }

        list.set(list.size()-1,firstElement);

        return list;
    }

}
