package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(lastDigit(17, 1277));
    }

    public static boolean lastDigit(int a, int b) {
        return (a%10==b%10);
    }
}
