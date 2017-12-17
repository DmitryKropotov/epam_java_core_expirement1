package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(without2("HelloHe"));
    }

    public static String without2(String str) {
        if(str.length()<2){//preventing stringOutOfRangeExeption
            return str;
        }

        if(str.substring(0, 2).equals(str.substring(str.length()-2, str.length()))){
            return str.substring(2, str.length());
        }
        else{
            return str;
        }
    }
}
