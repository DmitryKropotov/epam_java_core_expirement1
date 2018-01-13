package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] a = {"aaa", "bbb", "ccc"};
        String[] b = {"aaa", "bbb", "dcc"};
        System.out.println(matchUp(a, b));
    }

    public static int matchUp(String[] a, String[] b) {
        int result = 0;
        for(int i=0; i<a.length; i++){
            if(!a[i].isEmpty() && !b[i].isEmpty() && a[i].charAt(0)==b[i].charAt(0)){
                result++;
            }
        }
        return result;
    }
}
