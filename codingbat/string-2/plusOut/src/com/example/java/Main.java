package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(plusOut("ab", "abc"));
    }

    public static String plusOut(String str, String word) {
        for(int i=0; i<str.length(); i++){
            if(i>=str.length()-word.length()+1 || !str.substring(i, i+word.length()).equals(word)){
                str=str.replaceFirst(String.valueOf(str.charAt(i)), "+");
            }
            else{
                i=i+word.length()-1;
            }
        }

        return str;
    }
}
