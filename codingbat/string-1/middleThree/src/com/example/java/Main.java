package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(middleThree("12345"));
    }

    public static String middleThree(String str) {
        return str.substring(str.length()/2-1, str.length()/2+2);
    }
}
