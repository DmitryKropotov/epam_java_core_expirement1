package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(twoAsOne(1, 2, 3));
    }

    public static boolean twoAsOne(int a, int b, int c) {
        return (a+b==c || a+c==b || b+c==a);
    }

}
