package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(in3050(31, 60));
    }

    public static boolean in3050(int a, int b) {
        return (a>=30 && a<=40 && b>=30 && b<=40 || a>=40 && a<=50 && b>=40 && b<=50);
    }
}
