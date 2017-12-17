package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(minCat("Hello", "Hi"));
    }

    public static String minCat(String a, String b) {
        if(a.length()==0){//preventing StringOutOfRangeExeption
            return "";
        }

        if(a.length()>=b.length()){
            return a.substring(a.length()-b.length(), a.length())+b;
        }
        else{
            return a+b.substring(b.length()-a.length(), b.length());
        }
    }
}
