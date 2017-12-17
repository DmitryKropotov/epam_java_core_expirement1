package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(deFront("a cat"));
    }

    public static String deFront(String str) {
        String result="";

        if(str.charAt(0)=='a'){
            result=result+"a";
        }
        if(str.charAt(1)=='b'){
            result=result+"b";
        }
        result=result+str.substring(2, str.length());

        return result;
    }
}
