package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, String> map = new HashMap<>();
        map.put("a", "gogogo");
        map.put("b", "nonono");
        System.out.println(mapBully(map));
    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        String valueA = map.get("a");
        if(valueA != null){
            map.put("b", valueA);
            map.put("a", "");
        }
        return map;
    }
}
