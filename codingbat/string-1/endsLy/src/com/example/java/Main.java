package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(endsLy("Hello"));
    }

    public static boolean endsLy(String str) {
        if(str.length()<2){
            return false;
        }
        return str.substring(str.length()-2, str.length()).equals("ly");
    }
}
