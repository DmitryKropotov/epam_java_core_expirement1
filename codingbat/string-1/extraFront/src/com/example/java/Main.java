package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(extraFront("Hello"));
    }

    public static String extraFront(String str) {
        switch(str.length()){
            case 0: return "";

            case 1: return str+str+str;

            default: return str.substring(0, 2)+str.substring(0, 2)+str.substring(0, 2);
        }
    }
}
