package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(doubleChar("The end"));
    }

    public static String doubleChar(String str) {
        String result="";
        for(int i=0; i<str.length(); i++){
            result = result + str.substring(i, i+1) + str.substring(i, i+1);
        }
        return result;
    }
}
