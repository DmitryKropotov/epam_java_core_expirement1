package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] pi=makePi();
        for (int i: pi){
            System.out.println(i);
        }
    }

    public static int[] makePi() {
        int[] pi={3, 1, 4};
        return pi;
    }

}
