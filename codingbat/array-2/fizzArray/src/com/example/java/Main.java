package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] result = fizzArray(3);
        for (int i: result) {
            System.out.println(i);
        }
    }

    public static int[] fizzArray(int n) {
        int[] result = new int[n];
        for(int i=0; i<n; i++){
            result[i] = i;
        }
        return result;
    }
}
