package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(max1020(1, 2));
    }

    public static int max1020(int a, int b) {
        if(a>=10 && a<=20 && b>=10 && b<=20){
            return Math.max(a, b);
        }
        if(a>=10 && a<=20){
            return a;
        }
        if(b>=10 && b<=20){
            return b;
        }
        return 0;
    }
}
