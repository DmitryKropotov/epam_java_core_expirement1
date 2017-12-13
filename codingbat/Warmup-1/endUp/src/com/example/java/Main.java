package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(endUp("Hello"));
    }

    public static String endUp(String str) {
        if(str.length()<3){
            return str.toUpperCase();
        }
        return str.substring(0, str.length()-3)+str.substring(str.length()-3, str.length()).toUpperCase();
    }
}
