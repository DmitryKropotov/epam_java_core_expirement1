package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(nearHundred(1));
    }

    public static boolean nearHundred(int n) {
        return (n>=90 && n<=110) || (n>=190 && n<=210);
    }
}
