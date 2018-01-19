package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1, 3, 6, 9};
        System.out.println(groupNoAdj(0, nums, 10));
    }

    public static boolean groupNoAdj(int start, int[] nums, int target) {
        if(target==0){
            return true;
        }
        if(start>=nums.length){
            return false;
        }
        return groupNoAdj(start+2, nums, target-nums[start]) || groupNoAdj(start+1, nums, target);
    }
}
