package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(repeatFront("Crocodile", 4));
    }

    public static String repeatFront(String str, int n) {
        String firstCharactersToAdd=str.substring(0, n);
        String result="";
        for(int i = n; i>0; i--){
            result=result+firstCharactersToAdd;
            firstCharactersToAdd=firstCharactersToAdd.substring(0, i-1);
        }
        return result;
    }
}
