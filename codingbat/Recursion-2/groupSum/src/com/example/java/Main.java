package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1, 3, 7, 5};
        System.out.println(groupSum(0, nums, 9));
    }

    public static boolean groupSum(int start, int[] nums, int target) {
        if(target==0){
            return true;
        }
        if(start==nums.length){
            return false;
        }
        return groupSum(start+1, nums, target-nums[start]) ||  groupSum(start+1, nums, target);
    }
}
