package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(endX("xxre"));
    }

    public static String endX(String str) {
        if(str.length()<2){
            return str;
        }
        if(str.charAt(0)=='x'){
            return endX(str.substring(1, str.length()))+'x';
        } else {
            return str.substring(0, 1)+endX(str.substring(1, str.length()));
        }
    }
}
