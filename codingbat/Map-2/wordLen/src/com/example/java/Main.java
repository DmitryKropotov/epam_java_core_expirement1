package com.example.java;

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] strings = {"a", "cat", "that"};
        System.out.println(wordLen(strings));
    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String i: strings){
            if(!map.containsKey(i)){
                map.put(i, i.length());
            }
        }
        return map;
    }
}
