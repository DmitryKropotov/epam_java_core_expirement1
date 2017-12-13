package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(middleTwo("string"));
    }

    public static String middleTwo(String str) {
        return str.substring(str.length()/2-1, str.length()/2+1);
    }
}
