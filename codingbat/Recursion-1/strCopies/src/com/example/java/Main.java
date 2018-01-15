package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(strCopies("catcowcat", "cat", 2));
    }

    public static boolean strCopies(String str, String sub, int n) {
        if(str.length()<sub.length()){
            return n==0;
        }
        if(str.substring(0, sub.length()).equals(sub)){
            if(n==1){
                return true;
            } else {
                return strCopies(str.substring(1, str.length()), sub, n-1);
            }
        } else {
            return strCopies(str.substring(1, str.length()), sub, n);
        }
    }
}
