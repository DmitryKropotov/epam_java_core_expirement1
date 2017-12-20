package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(countCode("javacode"));
    }

    public static int countCode(String str) {
        int amountOfCode = 0;
        for(int i = 0; i<str.length()-3; i++){
            if(str.substring(i, i+2).equals("co") && str.charAt(i+3)=='e'){
                amountOfCode++;
            }
        }
        return amountOfCode;
    }
}
