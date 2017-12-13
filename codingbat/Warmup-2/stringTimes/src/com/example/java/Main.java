package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(stringTimes("Hello", 2));
    }

    public static String stringTimes(String str, int n) {
        String returnStr="";
        for(int i=0; i<n; i++){
            returnStr=returnStr+str;
        }
        return returnStr;
    }
}
