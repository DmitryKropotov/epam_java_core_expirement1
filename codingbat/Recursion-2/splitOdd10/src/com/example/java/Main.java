package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1, 2, 10, 4};
        System.out.println(splitOdd10(nums));
    }

    public static boolean splitOdd10(int[] nums) {
        if(nums.length==0){
            return false;
        }
        return splitting(nums, nums[0], 0, 1);
    }

    static boolean splitting(int[]nums, int sum1, int sum2, int splitter){
        if(splitter==nums.length){
            return sum1%10==0 && sum2%2==1 || sum1%2==1 && sum2%10==0;
        }
        return splitting(nums, nums[splitter]+sum1, sum2, splitter+1) || splitting(nums, sum1, nums[splitter]+sum2, splitter+1);
    }
}
