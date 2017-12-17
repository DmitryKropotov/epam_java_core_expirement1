package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(lastTwo("Hello"));
    }

    public static String lastTwo(String str) {
        if(str.length()<2){//we stop OutOfRange exeption, which would happen in case of
            return str;// length of str to be fewer 2
        }

        str=str.substring(0, str.length()-2)+String.valueOf(str.charAt(str.length()-1))+
                String.valueOf(str.charAt(str.length()-2));
        return str;
    }
}
