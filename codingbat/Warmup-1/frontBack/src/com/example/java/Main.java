package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(frontBack("Hello"));
    }

    public static String frontBack(String str) {
        if(str.length()>=2){
            char firstSymbol=str.charAt(0);
            char lastSymbol=str.charAt(str.length()-1);
            str=lastSymbol+str.substring(1, str.length()-1)+firstSymbol;
        }
        return str;
    }
}
