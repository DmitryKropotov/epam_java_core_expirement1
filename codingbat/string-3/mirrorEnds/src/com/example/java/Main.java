package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(mirrorEnds("abXYZba"));
    }

    public static String mirrorEnds(String string) {
        String result = "";
        final int LENGTH_OF_STRING = string.length();
        for(int i=0; i<LENGTH_OF_STRING; i++){
            if(string.charAt(i)==string.charAt(LENGTH_OF_STRING-1-i)){
                result = result.concat(String.valueOf(string.charAt(i)));
            } else{
                break;
            }
        }
        return result;
    }
}
