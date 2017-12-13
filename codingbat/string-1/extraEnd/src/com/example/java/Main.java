package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(extraEnd("Hello"));
    }

    public static String extraEnd(String str) {
        String endOfStr=str.substring(str.length()-2, str.length());
        return endOfStr+endOfStr+endOfStr;
    }
}
