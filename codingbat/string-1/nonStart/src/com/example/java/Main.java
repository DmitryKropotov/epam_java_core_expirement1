package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(nonStart("Hi", "there"));
    }

    public static String nonStart(String a, String b) {
        return a.substring(1, a.length())+b.substring(1, b.length());
    }
}
