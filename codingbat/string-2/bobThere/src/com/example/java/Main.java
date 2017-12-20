package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(bobThere("bob"));
    }

    public static boolean bobThere(String str) {
        for(int i = 0; i<str.length()-2; i++){
            if(str.charAt(i)=='b' && str.charAt(i+2)=='b') {
                return true;
            }
        }
        return false;
    }
}
