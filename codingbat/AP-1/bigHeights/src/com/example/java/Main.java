package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] heights = {1, 4, 10, 5};
        System.out.println(bigHeights(heights, 0, 3));
    }

    public static int bigHeights(int[] heights, int start, int end) {
        int result = 0;
        for(int i=start; i<end; i++){
            if(Math.abs(heights[i+1]-heights[i])>=5){
                result++;
            }
        }
        return result;
    }
}
