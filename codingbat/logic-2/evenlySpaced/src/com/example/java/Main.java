package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(evenlySpaced(11, 1, 6));
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int buffer;

        if(b<a){
            buffer = a;
            a = b;
            b = buffer;
        }

        if(c<b){
            buffer = b;
            b = c;
            c = buffer;
        }

        if(b<a){
            buffer = a;
            a = b;
            b = buffer;
        }

        return b-a==c-b;
    }
}
