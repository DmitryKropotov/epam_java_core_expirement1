package com.example.java;

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] strings = {"code", "bug", "code"};
        System.out.println(firstChar(strings));
    }

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String i: strings){
            if(!map.containsKey(i.substring(0, 1))){
                map.put(i.substring(0, 1), i);
            } else{
                map.put(i.substring(0, 1), map.get(i.substring(0, 1))+i);
            }
        }
        return map;
    }
}
