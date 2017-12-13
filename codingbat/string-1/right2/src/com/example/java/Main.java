package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(right2("Hello"));
    }

    public static String right2(String str) {
        return str.substring(str.length()-2, str.length())+str.substring(0, str.length()-2);
    }
}
