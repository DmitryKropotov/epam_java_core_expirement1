package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(parenBit("a(hello)b"));
    }

    public static String parenBit(String str) {
        if(str.charAt(0)=='('){
            if(str.charAt(str.length()-1)==')'){
                return str;
            }
            return parenBit(str.substring(0, str.length()-1));
        }
        return parenBit(str.substring(1, str.length()));
    }
}
