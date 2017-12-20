package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(repeatSeparator("Hello", "world", 3));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String result="";

        for(int i = 0; i<count; i++){
            if(i<count-1){
                result = result+word+sep;
            }
            else{
                result = result+word;
            }
        }

        return result;
    }
}
