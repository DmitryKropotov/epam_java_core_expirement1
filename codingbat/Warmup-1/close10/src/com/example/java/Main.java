package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(close10(1, 12));
    }

    public static int close10(int a, int b) {
        if(Math.abs(a-10)<Math.abs(b-10)){
            return a;
        }
        if(Math.abs(a-10)>Math.abs(b-10)){
            return b;
        }
        return 0;
    }
}
