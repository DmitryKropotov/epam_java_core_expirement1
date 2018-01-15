package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(strCount("catcowcat", "cat"));
    }

    public static int strCount(String str, String sub) {
        if(str.length()<sub.length()){
            return 0;
        }
        if(str.substring(0, sub.length()).equals(sub)){
            return 1+strCount(str.substring(sub.length(), str.length()), sub);
        } else {
            return strCount(str.substring(1, str.length()), sub);
        }
    }
}
