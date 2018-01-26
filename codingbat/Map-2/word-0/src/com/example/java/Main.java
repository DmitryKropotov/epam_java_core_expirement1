package com.example.java;

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] strings = {"a", "b", "c"};
        System.out.println(word0(strings));
    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<strings.length; i++){
            if(!map.containsKey(strings[i])){
                map.put(strings[i], 0);
            }
        }
        return map;
    }
}
