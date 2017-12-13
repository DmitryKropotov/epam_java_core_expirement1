package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(lessBy10(1, 2, 3));
    }

    public static boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a-b)>=10 || Math.abs(a-c)>=10 || Math.abs(b-c)>=10);
    }
}
