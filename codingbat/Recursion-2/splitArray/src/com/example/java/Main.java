package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(splitArray(nums));
    }

    public static boolean splitArray(int[] nums) {
        if(nums.length==0){
            return true;
        }
        return splitting(nums, nums[0], 0, 1);
    }

    static boolean splitting(int[]nums, int sum1, int sum2, int splitter){
        if(splitter==nums.length){
            return sum1==sum2;
        }
        return splitting(nums, nums[splitter]+sum1, sum2, splitter+1) || splitting(nums, sum1, nums[splitter]+sum2, splitter+1);
    }
}
