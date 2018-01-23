package com.example.java;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, String> map = new HashMap<>();
        map.put("a", "value A");
        map.put("b", "value BA");
        System.out.println(mapAB4(map));
    }

    public static Map<String, String> mapAB4(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            if(map.get("a").length()!=map.get("b").length()){
                map.put("c", (map.get("a").length()>map.get("b").length())? map.get("a"): map.get("b"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }
}
