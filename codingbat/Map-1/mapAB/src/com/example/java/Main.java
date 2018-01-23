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
        System.out.println(mapAB(map));
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab", map.get("a")+map.get("b"));
        }
        return map;
    }
}
