package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 6};
        System.out.println(scoresIncreasing(a));

    }

    public static boolean scoresIncreasing(int[] scores) {
        final int LENGTH_OF_ARRAY = scores.length;
        for(int i=1; i<LENGTH_OF_ARRAY; i++){
            if(scores[i]<scores[i-1]){
                return false;
            }
        }
        return true;
    }
}


