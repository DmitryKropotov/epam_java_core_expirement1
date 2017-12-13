package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(notString("Hello"));
    }

    public static String notString(String str) {
        if(!str.startsWith("not", 0)){
            str="not "+str;
        }
        return str;
    }
}
