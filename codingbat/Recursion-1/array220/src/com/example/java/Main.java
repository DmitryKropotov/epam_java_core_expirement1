package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {20, 2, 21};
        System.out.println(array220(nums, 0));
    }

    public static boolean array220(int[] nums, int index) {
        if(nums.length<2){
            return false;
        }
        if(index==nums.length-2){
            return nums[index+1]==10*nums[index];
        }
        if(nums[index+1]==10*nums[index]){
            return true;
        } else{
            return array220(nums, index+1);
        }
    }
}
