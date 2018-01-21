package com.example.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] words = {"a", "bb", "c", "ddd"};
        System.out.println(wordsWithoutList(words, 1));
    }

    public static List wordsWithoutList(String[] words, int len) {
        List result = new ArrayList();
        for(int i=0; i<words.length; i++){
            if(words[i].length()!=len){
                result.add(words[i]);
            }
        }
        return result;
    }
}
