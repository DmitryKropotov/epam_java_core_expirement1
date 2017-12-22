package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(makeBricks(2, 5, 24));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        if(5*big+small<goal || goal%5>small){
            return false;
        }

        return true;
    }
}
