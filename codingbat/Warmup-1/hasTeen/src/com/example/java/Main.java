package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(loneTeen(15, 15));
    }

    public static boolean loneTeen(int a, int b) {
        return((a>=13 && a<=19) ^ (b>=13 && b<=19));
    }
}
