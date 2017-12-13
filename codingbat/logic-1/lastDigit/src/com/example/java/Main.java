package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(lastDigit(10, 17, 110));
    }

    public static boolean lastDigit(int a, int b, int c) {
        return(a%10==b%10 || a%10==c%10 || b%10==c%10);
    }
}
