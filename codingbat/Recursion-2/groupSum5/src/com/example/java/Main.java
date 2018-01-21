package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {3, 5, 1};
        System.out.println(groupSum5(0, nums, 9));
    }

    public static boolean groupSum5(int start, int[] nums, int target) {
        if(target==0){
            if(start<nums.length){
                return !isMultiple5Further(start, nums);
            } else {
                return true;
            }
        }
        if(start>=nums.length){
            return false;
        }
        if(nums[start]%5==0){
            return groupSum5(start+1, nums, target-nums[start]);
        } else if(nums[start]==1 && start!=0 && nums[start-1]%5==0){
            return groupSum5(start+1, nums, target);
        }
        return groupSum5(start+1, nums, target-nums[start]) || groupSum5(start+1, nums, target);
    }

    static boolean isMultiple5Further(int index, int[] nums) {
        if (index == nums.length) {
            return false;
        } else if (nums[index] % 5 == 0) {
            return true;
        }
        return isMultiple5Further(index + 1, nums);
    }
}
