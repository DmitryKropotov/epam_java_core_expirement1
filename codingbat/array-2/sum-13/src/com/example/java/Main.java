package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 13};
        System.out.println(sum13(a));
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        final int LENGTH_OF_NUMS = nums.length;
        if(LENGTH_OF_NUMS!=0 && nums[0]!=13){
            sum = nums[0];
        }
        for(int i=1; i<LENGTH_OF_NUMS; i++){
            if (nums[i]!=13 && nums[i-1]!=13){
                sum = sum+nums[i];
            }
        }
        return sum;
    }
}
