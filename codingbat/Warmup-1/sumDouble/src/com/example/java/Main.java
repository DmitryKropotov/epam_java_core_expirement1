package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDouble(1, 2));
    }

    public static int sumDouble(int a, int b) {
        if(a!=b){
            return a+b;
        }
        return 4*a;
    }
}
