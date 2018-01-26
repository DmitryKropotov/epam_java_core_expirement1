package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] strings = {"code", "bug"};
        System.out.println(pairs(strings));
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String i: strings){
            map.put(i.substring(0, 1), i.substring(i.length()-1, i.length()));
        }
        return map;
    }
}
