package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1, 2, 3};
        System.out.println(maxTriple(nums));
    }

    public static int maxTriple(int[] nums) {
        int result = Math.max(nums[0], nums[nums.length/2]);

        if(nums [nums.length-1] > result){
            result = nums [nums.length-1];
        }

        return result;
    }
}
