package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(greenTicket(1, 2, 3));
    }

    public static int greenTicket(int a, int b, int c) {
        if(a!=b && a!=c && b!=c){
            return 0;
        }
        if(a==b && b==c){
            return 20;
        }
        return 10;
    }
}
