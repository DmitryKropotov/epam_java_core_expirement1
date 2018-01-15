package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(countHi2("ahixhi"));
    }

    public static int countHi2(String str) {
        if(str.length()<2){
            return 0;
        }
        if(str.substring(0, 2).equals("hi")){
            return 1+countHi2(str.substring(2, str.length()));
        } else if(str.charAt(0)=='x'){
            int indexOfFirstNotTheSameChar = 1;
            while(indexOfFirstNotTheSameChar<str.length()-2 && str.charAt(indexOfFirstNotTheSameChar)=='x'){
                indexOfFirstNotTheSameChar++;
            }
            return countHi2(str.substring(indexOfFirstNotTheSameChar+1, str.length()));
        } else {
            return countHi2(str.substring(1, str.length()));
        }
    }
}
