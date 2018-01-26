package com.example.java;

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] strings = {"ab", "ac", "aaa", "abb"};
        strings = allSwap(strings);
        for (String i: strings){
            System.out.println(i);
        }
    }

    public static String[] allSwap(String[] strings) {
        Map<String, Integer> numberOfIndexToSwap = new HashMap<>();
        for(int i=0; i<strings.length; i++){
            if(!numberOfIndexToSwap.containsKey(strings[i].substring(0, 1)) || numberOfIndexToSwap.get(strings[i].substring(0, 1))==-1){
                numberOfIndexToSwap.put(strings[i].substring(0, 1), i);
            } else if(numberOfIndexToSwap.get(strings[i].substring(0, 1))!=-1){
                int index=numberOfIndexToSwap.get(strings[i].substring(0, 1));
                String buffer = strings[index];
                strings[index] = strings[i];
                strings[i] = buffer;
                numberOfIndexToSwap.put(strings[i].substring(0, 1), -1);
            }
        }
        return strings;
    }
}
