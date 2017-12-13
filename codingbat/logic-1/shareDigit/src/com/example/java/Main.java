package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(shareDigit(1, 2));
    }

    public static boolean shareDigit(int a, int b) {
        return(a/10==b/10 || a/10==b%10 || a%10==b/10 || a%10==b%10);
    }
}
