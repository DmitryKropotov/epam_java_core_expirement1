package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(in1To10(4, false));
    }

    public static boolean in1To10(int n, boolean outsideMode) {
        return ((!outsideMode && n>=1 && n<=10) || (outsideMode && (n<=1 || n>=10)));
    }
}
