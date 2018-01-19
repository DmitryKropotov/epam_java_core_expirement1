package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {2, 4, 8};
        System.out.println(groupSumClump(0, nums, 10));
    }

    public static boolean groupSumClump(int start, int[] nums, int target) {
        if(target==0){
            return true;
        }
        if(start>=nums.length){
            return false;
        }
        int adjacentValue = nums[start];
        int amountOfCurrentValue = 1;
        while(start+amountOfCurrentValue<nums.length && nums[start+amountOfCurrentValue]==adjacentValue){
            amountOfCurrentValue++;
        }
        return groupSumClump(start+amountOfCurrentValue, nums, target-amountOfCurrentValue*adjacentValue) ||  groupSumClump(start+amountOfCurrentValue, nums, target);
    }
}
