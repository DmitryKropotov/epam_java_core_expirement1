package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(inOrderEqual(1, 2, 3,true));
    }

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return(equalOk && a<=b && b<=c || !equalOk && a<b && b<c);
    }
}
