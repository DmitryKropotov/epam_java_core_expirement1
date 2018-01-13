package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(123));
    }

    public static int sumDigits(int n) {
        if(n==0){
            return 0;
        }
        return n%10+sumDigits(n/10);
    }
}
