package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(nearTen(9));
    }

    public static boolean nearTen(int num) {
        return ((num%10>=0 && num%10<=2) || num%10==8 || num%10==9);
    }
}
