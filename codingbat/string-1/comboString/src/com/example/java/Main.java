package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(comboString("hi", "Hello"));
    }

    public static String comboString(String a, String b) {
        if(a.length()<b.length()){
            return a+b+a;
        }
        return b+a+b;
    }
}
