package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, String> map = new HashMap<>();
        map.put("a", "value A");
        map.put("v", "value V");
        System.out.println(mapAB3(map));
    }

    public static Map<String, String> mapAB3(Map<String, String> map) {
        if(map.containsKey("a") && !map.containsKey("b")){
            map.put("b", map.get("a"));
        }  else if(!map.containsKey("a") && map.containsKey("b")){
            map.put("a", map.get("b"));
        }
        return map;
    }
}
