package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(less20(19));
    }

    public static boolean less20(int n) {
        return(n%20==18 || n%20==19);
    }
}
