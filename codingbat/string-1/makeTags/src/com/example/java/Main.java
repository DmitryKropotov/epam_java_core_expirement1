package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(makeTags("i", "day"));
    }

    public static String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }
}
