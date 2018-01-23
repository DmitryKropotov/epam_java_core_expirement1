package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, String> map = new HashMap<>();
        map.put("a", "auto");
        map.put("b", "bus");
        map.put("c", "crown");
        System.out.println(topping1(map));
    }

    public static Map<String, String> topping1(Map<String, String> map) {
        if(map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }


}
