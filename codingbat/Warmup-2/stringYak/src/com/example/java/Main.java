package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(stringYak("yikyakbb"));
    }

    public static String stringYak(String str) {
        String result="";
        for(int i=0; i<str.length(); i++){
            if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
                i =  i + 2;
            } else {
                result = result + str.charAt(i);
            }
        }
        return result;
    }
}
