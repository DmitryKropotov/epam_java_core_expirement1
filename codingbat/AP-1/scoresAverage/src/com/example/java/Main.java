package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 100, 3};
        System.out.println(scoresAverage(a));
    }

    public static int scoresAverage(int[] scores) {
        final int LENGTH_OF_ARRAY = scores.length;
        return Math.max(average(scores, 0, LENGTH_OF_ARRAY/2-1), average(scores, LENGTH_OF_ARRAY/2, LENGTH_OF_ARRAY-1));
    }

    static int average(int[] scores, int start, int end) {
        int sum = 0;
        for(int i = start; i<=end; i++){
            sum+=scores[i];
        }
        return sum/(end-start+1);
    }
}
