package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(withoutEnd("Hello"));
    }

    public static String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }
}
