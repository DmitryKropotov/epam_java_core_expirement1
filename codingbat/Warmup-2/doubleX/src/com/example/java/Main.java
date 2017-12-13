package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(doubleX("aaxx"));
    }

    static boolean doubleX(String str) {
        int firstOccurenceOfX=str.indexOf("x");
        if(firstOccurenceOfX==-1 || firstOccurenceOfX==str.length()-1){
            return false;
        }
        return str.charAt(firstOccurenceOfX+1)=='x';
    }
}
