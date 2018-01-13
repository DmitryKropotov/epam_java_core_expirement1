package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(dividesSelf(72));
    }

    public static boolean dividesSelf(int n) {
        int shortenedN = n;
        while(shortenedN!=0){
            if(shortenedN%10==0 || n%(shortenedN%10)!=0){
                return false;
            }
            shortenedN = shortenedN/10;
        };
        return true;
    }
}
