package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(backAround("Exit"));
    }

    public static String backAround(String str) {
        char lastChar=str.charAt(str.length()-1);
        return lastChar+str+lastChar;
    }
}
