package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(stringBits("Hello"));
    }

    public static String stringBits(String str) {
        String result="";
        for(int i=0; i<str.length(); i+=2){
            result=result+str.charAt(i);
        }
        return result;
    }
}
