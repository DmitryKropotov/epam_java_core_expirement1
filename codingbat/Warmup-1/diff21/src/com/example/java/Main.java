package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(diff21(2));
    }

    public static int diff21(int n) {
        if(n<=21){
            return 21-n;
        }
        return (n-21)*2;
    }
}
