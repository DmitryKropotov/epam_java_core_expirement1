package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums={1, 2, 3};
        System.out.println(sum2(nums));
    }

    public static int sum2(int[] nums) {
        switch(nums.length){
            case 0: return 0;

            case 1: return nums[0];

            default: return nums[0]+nums[1];
        }
    }
}

