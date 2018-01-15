package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(stringClean("yyzzza"));
    }

    public static String stringClean(String str) {
        if(str.length()<2){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            int indexOfFirstNotTheSameChar = 2;
            while(indexOfFirstNotTheSameChar<str.length() && str.charAt(indexOfFirstNotTheSameChar)==str.charAt(0)){
                indexOfFirstNotTheSameChar++;
            }
            return str.substring(0, 1)+stringClean(str.substring(indexOfFirstNotTheSameChar, str.length()));
        } else {
            return str.substring(0, 1)+stringClean(str.substring(1, str.length()));
        }
    }
}
