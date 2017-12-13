package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(inOrder(1, 2, 3, true));
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        return(c>b && (!bOk && b>a || bOk));
    }
}
