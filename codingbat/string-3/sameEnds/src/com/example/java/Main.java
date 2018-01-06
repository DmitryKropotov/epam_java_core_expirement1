package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sameEnds("abXYab"));
    }

    public static String sameEnds(String string) {
        final int LENGTH_OF_STRING = string.length();
        if(LENGTH_OF_STRING<2){
            return "";
        }
        for(int i=(LENGTH_OF_STRING+1)/2; i<LENGTH_OF_STRING; i++){
            if(string.charAt(0)==string.charAt(i) && string.substring(0, LENGTH_OF_STRING-i).equals(string.substring(i, LENGTH_OF_STRING))){
                return string.substring(0, LENGTH_OF_STRING-i);
            }
        }
        return "";
    }
}
