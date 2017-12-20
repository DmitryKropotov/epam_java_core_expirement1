package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(prefixAgain("HelloHe", 2));
    }

    public static boolean prefixAgain(String str, int n) {
        String prefix=str.substring(0, n);

        for(int i = n; i<str.length()-n+1; i++){
            if(str.substring(i, i+n).equals(prefix)){
                return true;
            }
        }

        return false;
    }
}
