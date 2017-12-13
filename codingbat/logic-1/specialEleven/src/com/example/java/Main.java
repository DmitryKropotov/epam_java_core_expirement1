package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(specialEleven(12));
    }

    public static boolean specialEleven(int n) {
        if(n<0) n=-n;
        return (n%11==0 || n%11==1);
    }
}
