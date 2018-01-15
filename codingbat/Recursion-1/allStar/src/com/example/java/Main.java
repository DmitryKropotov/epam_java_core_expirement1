package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(allStar("hello"));
    }

    public static String allStar(String str) {
        if(str.length()<2){
            return str;
        }
        return str.substring(0, 1)+"*"+allStar(str.substring(1, str.length()));
    }
}
