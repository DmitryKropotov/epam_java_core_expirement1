package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(countXX("abcxx"));
    }

    static int countXX(String str) {
        int counterXX=0;
        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i, i+2).equals("xx")){
                counterXX++;
            }
        }
        return counterXX;
    }
}
