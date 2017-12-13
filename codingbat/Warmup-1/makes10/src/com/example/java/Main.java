package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(makes10(5, 5));
    }

    public static boolean makes10(int a, int b) {
        if(a==10 || b==10 || (a+b)==10){
            return true;
        }
        return false;
    }
}
