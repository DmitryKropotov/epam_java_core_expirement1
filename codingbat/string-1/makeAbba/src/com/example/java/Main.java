package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(makeAbba("Hi", "Bye"));
    }

    public static String makeAbba(String a, String b) {
        return a+b+b+a;
    }
}
