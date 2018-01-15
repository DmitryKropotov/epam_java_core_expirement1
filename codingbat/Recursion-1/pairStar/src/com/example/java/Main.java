package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(pairStar("hello"));
    }

    public static String pairStar(String str) {
        if(str.length()<2){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            return str.substring(0, 1)+"*"+pairStar(str.substring(1, str.length()));
        } else{
            return str.substring(0, 1)+pairStar(str.substring(1, str.length()));
        }
    }
}
