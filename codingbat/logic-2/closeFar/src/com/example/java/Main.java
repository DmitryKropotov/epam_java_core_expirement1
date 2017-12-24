package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(closeFar(1, 2, 3));
    }

    public static boolean closeFar(int a, int b, int c) {
        return (Math.abs(a-b)<=1 &&  Math.abs(c-a)>=2 ||  Math.abs(a-c)<=1 &&  Math.abs(b-a)>=2)  && Math.abs(c-b)>=2;
    }
}
