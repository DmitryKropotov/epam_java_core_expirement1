package com.example.java;

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] strings = {"a", "b", "a"};
        System.out.println(wordAppend(strings));
    }

    public static String wordAppend(String[] strings) {
        String result="";
        Map<String, Integer> counter = new HashMap<>();
        for(String i: strings){
            if(!counter.containsKey(i)){
                counter.put(i, 1);
            } else{
                int count = counter.get(i);
                counter.put(i, count+1);
                if((count+1)%2==0){
                    result=result+i;
                }
            }
        }
        return result;
    }
}
