package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(stringSplosion("Hello"));
    }

    public static String stringSplosion(String str) {
        String result="";
        for(int i=1; i<=str.length(); i++){
            result=result+str.substring(0, i);
        }
        return result;
    }
}
