package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sortaSum(12, 15));
    }

    public static int sortaSum(int a, int b) {
        if(a+b>=10 && a+b<=19) return 20;
        return a+b;
    }
}
