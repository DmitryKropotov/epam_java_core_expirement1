package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 2, 4};
        System.out.println(more14(a));
    }

    public static boolean more14(int[] nums) {
        int amountOfOnes = 0,  amountOfFours = 0;
        final int LENGTH_OF_NUMS = nums.length;
        for(int i=0; i<LENGTH_OF_NUMS; i++){
            if(nums[i]==1){
                amountOfOnes++;
            }
            if(nums[i]==4){
                amountOfFours++;
            }
        }
        return amountOfOnes>amountOfFours;
    }
}
