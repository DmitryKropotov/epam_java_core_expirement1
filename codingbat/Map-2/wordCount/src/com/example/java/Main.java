package com.example.java;

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] strings = {"code", "bug", "code"};
        System.out.println(wordCount(strings));
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map  = new HashMap<>();
        for(String i: strings){
            if(!map.containsKey(i)){
                map.put(i, 1);
            } else{
                map.put(i, map.get(i)+1);
            }
        }
        return map;
    }
}
