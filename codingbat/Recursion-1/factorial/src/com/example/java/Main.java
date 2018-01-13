package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(factorial(15));
    }

    public static int factorial(int n) {
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
