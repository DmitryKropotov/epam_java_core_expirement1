package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(startHi("hi there"));
    }

    public static boolean startHi(String str) {
        if(str.length()<2){
            return false;
        }
        return (str.substring(0, 2).equals("hi"));
    }
}
