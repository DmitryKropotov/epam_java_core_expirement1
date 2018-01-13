package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(countHi("xhiabchi"));
    }

    public static int countHi(String str) {
        if(str.length()<2){
            return 0;
        }
        if(str.substring(0, 2).equals("hi")){
            return 1+countHi(str.substring(2, str.length()));
        } else {
            return countHi(str.substring(1, str.length()));
        }
    }
}
