package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(maxMod5(1, 2));
    }

    public static int maxMod5(int a, int b) {
        if(a!=b && (a%5!=b%5 && a>b || a%5==b%5 && a<b)){
            return a;
        }
        if(a!=b && (a%5!=b%5 && a<b || a%5==b%5 && a>b)){
            return b;
        }
        return 0;
    }
}
