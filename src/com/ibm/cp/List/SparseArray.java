package com.ibm.cp.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArray {

    public static void main(String[] args) {

    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here

        Map<Object, Integer> hashMap = new HashMap<>();

        for (String q : strings) {
            if (q.equals(q)) {
                if (hashMap.get(q) != null)
                    hashMap.put(q, hashMap.get(q) + 1);
                else
                    hashMap.put(q, 1);
            }
        }

        List<Integer> result = new ArrayList<>();

        for (String query : queries) {
            if (hashMap.get(query) != null)
                result.add(hashMap.get(query));
            else {
                result.add(0);

            }
        }

        return result;

    }
}
