package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums={1, 2};
        System.out.println(has23(nums));
    }

    public static boolean has23(int[] nums) {
        return nums[0]==2 || nums[0]==3 || nums[1]==2 || nums[1]==3;
    }
}
