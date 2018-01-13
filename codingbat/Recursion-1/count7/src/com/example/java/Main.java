package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(count7(71217));
    }

    public static int count7(int n) {
        if(n==7){
            return 1;
        }
        if(n<10 && n!=7){
            return 0;
        }
        if(n%10==7){
            return count7(n/10)+1;
        } else {
            return count7(n/10);
        }
    }
}
