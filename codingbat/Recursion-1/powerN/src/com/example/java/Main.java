package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(powerN(2, 15));
    }

    public static int powerN(int base, int n) {
        if(n==1){
            return base;
        }
        return base*powerN(base, n-1);
    }
}
