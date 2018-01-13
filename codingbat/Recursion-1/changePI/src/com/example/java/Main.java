package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(changePi("S=pir^2"));
    }

    public static String changePi(String str) {
        if(str.length()<2){
            return str;
        }
        if(str.substring(0, 2).equals("pi")){
            return "3.14"+changePi(str.substring(2, str.length()));
        } else {
            return str.charAt(0)+changePi(str.substring(1, str.length()));
        }
    }
}
