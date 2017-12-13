package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(makeOutWord("<<>>" , "word"));
    }

    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2)+word+out.substring(2, 4);
    }

}
