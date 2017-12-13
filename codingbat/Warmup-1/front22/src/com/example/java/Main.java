package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(front22("Exit"));
    }

    public static String front22(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        char[] first2Chars = str.substring(0, 2).toCharArray();
        return String.valueOf(first2Chars) + str + String.valueOf(first2Chars);
    }
}