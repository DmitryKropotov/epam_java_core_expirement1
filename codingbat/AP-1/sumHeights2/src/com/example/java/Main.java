package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] heights = {2, 4, 3, 0};
        System.out.println(sumHeights2(heights, 0, 2));
    }

    public static int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        for(int i=start; i<end; i++){
            if(heights[i+1]-heights[i]>0){
                sum+=2*(heights[i+1]-heights[i]);
            } else {
                sum+=heights[i]-heights[i+1];
            }
        }
        return sum;
    }
}
