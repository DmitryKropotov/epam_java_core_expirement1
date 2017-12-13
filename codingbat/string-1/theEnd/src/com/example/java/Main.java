package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(theEnd("Hello", true));
    }

    public  static String theEnd(String str, boolean front) {
        if(front){
            return String.valueOf(str.charAt(0));
        }
        return String.valueOf(str.charAt(str.length()-1));
    }
}
