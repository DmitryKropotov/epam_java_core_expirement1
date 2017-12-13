package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(left2("Hello"));
    }

    public static String left2(String str) {
        return str.substring(2, str.length())+str.substring(0, 2);
    }
}
