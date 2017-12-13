package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(withouEnd2("Hello"));
    }

    public static String withouEnd2(String str) {
        if(str.length()<2){
            return "";
        }
        return str.substring(1, str.length()-1);
    }
}
