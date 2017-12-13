package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(loneSum(1, 2, 3));
    }

    public static int loneSum(int a, int b, int c) {
        if(b==c && a!=b){
            return a;
        }
        if(a==c && a!=b){
            return b;
        }
        if(a==b && a!=c){
            return c;
        }
        if(a==b && a==c){
            return 0;
        }
        return a+b+c;
    }
}
