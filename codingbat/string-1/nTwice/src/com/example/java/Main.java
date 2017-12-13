package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(nTwice("Hello", 2));
    }

    public static String nTwice(String str, int n) {
        return str.substring(0, n)+str.substring(str.length()-n, str.length());
    }
}
