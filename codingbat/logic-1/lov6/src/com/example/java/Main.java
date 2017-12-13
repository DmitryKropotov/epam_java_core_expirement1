package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(love6(3, 4));
    }

    public static boolean love6(int a, int b) {
        return (a==6 || b==6 || Math.abs(a-b)==6 || a+b==6);
    }
}
