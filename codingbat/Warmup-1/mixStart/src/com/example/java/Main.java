package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(mixStart("mix pancakes"));
    }

    public static boolean mixStart(String str) {
        if(str.length()<3){
            return false;
        }
        return(str.substring(1, 3).equals("ix"));
    }
}
