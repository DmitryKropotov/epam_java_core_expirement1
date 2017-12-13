package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(posNeg(1, 2, true));
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        return ( ((a>0 && b<0) || (a<0 && b>0)) && !negative ) || (a<0 && b<0 && negative);
    }
}
