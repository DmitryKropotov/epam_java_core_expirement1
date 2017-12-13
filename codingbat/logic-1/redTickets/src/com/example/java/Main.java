package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(redTicket(1, 2, 2));
    }

    public static int redTicket(int a, int b, int c) {
        if(a==2 && b==2 && c==2){
            return 10;
        }
        else if(a==b && b==c){
            return 5;
        }
        else if(a!=b && a!=c){
            return 1;
        }
        else{
            return 0;
        }
    }
}
