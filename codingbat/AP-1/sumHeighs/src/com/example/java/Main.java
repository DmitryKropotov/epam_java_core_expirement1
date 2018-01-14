package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] heights = {2, 3, 1, 4};
        System.out.println(sumHeights(heights, 1, 3));
    }

    public static int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for(int i=start; i<end; i++){
            sum+=Math.abs(heights[i+1]-heights[i]);
        }
        return sum;
    }
}
