package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(old35(27));
    }

    public static boolean old35(int n) {
        return(n%3==0 ^ n%5==0);
    }
}
