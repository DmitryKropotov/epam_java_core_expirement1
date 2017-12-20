package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(endOther("xxx", "axxx"));
    }

    public static boolean endOther(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();

        if(a.length()>=b.length()){
            return a.substring(a.length()-b.length(), a.length()).equals(b);
        }

        return b.substring(b.length()-a.length(), b.length()).equals(a);
    }

}
