package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(firstTwo("Hello"));
    }

    public static String firstTwo(String str) {
        if(str.length()<2){
            return str;
        }
        return str.substring(0, 2);
    }
}
