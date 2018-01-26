package com.example.java;

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] strings = {"a", "b", "a"};
        System.out.println(wordMultiple(strings));
    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for(String i: strings){
            if(!map.containsKey(i)){
                map.put(i, false);
            } else{
                map.put(i, true);
            }
        }
        return map;
    }

}
