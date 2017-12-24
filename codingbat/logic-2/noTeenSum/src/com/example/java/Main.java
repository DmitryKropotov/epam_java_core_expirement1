package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(noTeenSum(13, 15, 10));
    }

    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a)+fixTeen(b)+fixTeen(c);
    }

    public static int fixTeen(int n) {
        if(n==13 || n==14 || n==17 || n==18 || n==19){
            return 0;
        }
        else{
            return n;
        }
    }
}
