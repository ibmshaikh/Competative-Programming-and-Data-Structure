package com.ibm.cp.string;

import java.util.ArrayList;
import java.util.HashMap;

public class SherlockString {

    public static void main(String[] args) {

        System.out.println(isValid("abcdefghhgfedecba"));

    }

    public static String isValid(String s) {

        HashMap<Character, Integer> hashmap = new HashMap();
        char[] mychar = s.toCharArray();

        int init = 0;
        boolean isFinal = false;
        boolean isNeed = true;

        ArrayList<Integer> integerArray = new ArrayList<Integer>();

        for(int i=0;i<mychar.length;i++){
            if(hashmap.get(mychar[i])!=null){
                int occurance = hashmap.get(mychar[i]);
                hashmap.put(mychar[i],occurance+1);
                integerArray.add(occurance+1);
            }else{
                hashmap.put(mychar[i],1);
            }
        }


        init = integerArray.get(0);

        for(int i=0;i<integerArray.size();i++){
            if(isFinal){
                isNeed = false;
            }
            if(init!=integerArray.get(i)){
                isFinal = true;
                init = integerArray.get(i);
            }
        }

        System.out.println(integerArray.toString());
        if(isNeed)
            return "YES";
        else
            return "NO";


    }

}
