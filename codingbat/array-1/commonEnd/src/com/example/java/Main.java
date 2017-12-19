package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={1, 2, 3, 4, 5}, b={0, 2, 5};
        System.out.println(commonEnd(a, b));
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0]==b[0] || a[a.length-1]==b[b.length-1];
    }
}
