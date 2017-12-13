package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(firstHalf("WooWoo"));
    }

    public static String firstHalf(String str) {
        return str.substring(0, str.length()/2);
    }


}
