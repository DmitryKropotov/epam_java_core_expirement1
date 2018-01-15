package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(countPairs("aba"));
    }

    public static int countPairs(String str) {
        if(str.length()<3){
            return 0;
        }
        if(str.charAt(0)==str.charAt(2)){
            return 1+countPairs(str.substring(1, str.length()));
        } else {
            return countPairs(str.substring(1, str.length()));
        }
    }
}
