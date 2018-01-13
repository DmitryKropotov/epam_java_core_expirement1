package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 100, 3};
        System.out.println(scores100(a));
    }

    public static boolean scores100(int[] scores) {
        final int LENGTH_OF_ARRAY = scores.length;
        for(int i=0; i<LENGTH_OF_ARRAY-1; i++){
            if(scores[i]==100 && scores[i+1]==100){
                return true;
            }
        }
        return false;
    }
}