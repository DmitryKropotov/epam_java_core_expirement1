package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(frontAgain("edited"));
    }

    public static boolean frontAgain(String str) {
        if(str.length()<2){//preventing StringIndexOutOfBoundsException
            return false;
        }

        return str.substring(0, 2).equals(str.substring(str.length()-2, str.length()));
    }

}
