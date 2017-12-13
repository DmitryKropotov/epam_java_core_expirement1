package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(twoChar("java", -1));
    }

    public static String twoChar(String str, int index) {
        if(index>=str.length()-1 || index<0){
            return str.substring(0, 2);
        }
        return str.substring(index, index+2);
    }
}
