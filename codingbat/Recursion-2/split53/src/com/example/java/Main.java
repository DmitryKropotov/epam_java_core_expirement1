package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1, 1};
        System.out.println(split53(nums));
    }

    public static boolean split53(int[] nums) {
        if(nums.length==0){
            return false;
        }
        if(nums[0]%5==0){
            return splitting(nums, nums[0], 0, 1);
        } else if(nums[0]%3==0){
            return splitting(nums, 0, nums[0], 1);
        } else{
            return splitting(nums, nums[0], 0, 1) || splitting(nums, 0, nums[0], 1);
        }
    }

    static boolean splitting(int[] nums, int sum1, int sum2, int splitter){
        if(splitter==nums.length){
            return sum1==sum2;
        }
        if(nums[splitter]%5==0){
            return splitting(nums, nums[splitter]+sum1, sum2, splitter+1);
        } else if(nums[splitter]%3==0){
            return splitting(nums, sum1, nums[splitter]+sum2, splitter+1);
        } else{
            return splitting(nums, nums[splitter]+sum1, sum2, splitter+1) || splitting(nums, sum1, nums[splitter]+sum2, splitter+1);
        }
    }
}
