package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(repeatEnd("abcd", 3));
    }

    public static String repeatEnd(String str, int n) {
        String lastNCharacters=str.substring(str.length()-n, str.length());
        String result="";
        for(int i = 0; i<n; i++){
            result=result+lastNCharacters;
        }
        return result;
    }
}
