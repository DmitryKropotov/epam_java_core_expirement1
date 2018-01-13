package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(noX("xaxb"));
    }

    public static String noX(String str) {
        if(str.length()==0){
            return "";
        }
        if(str.charAt(0)=='x'){
            return noX(str.substring(1, str.length()));
        } else {
            return str.charAt(0)+noX(str.substring(1, str.length()));
        }
    }
}
