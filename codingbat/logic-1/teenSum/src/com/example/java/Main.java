package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(teenSum(12, 18));
    }

    public static int teenSum(int a, int b) {
        if((a>=13 && a<=19) || (b>=13 && b<=19)) return 19;
        return a+b;
    }
}
