package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(squirrelPlay(1, true));
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        return temp>=60 && ((!isSummer && temp<=90) || (isSummer && temp<=100));
    }
}
