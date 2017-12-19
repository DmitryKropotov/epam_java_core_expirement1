package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1, 2, 3};
        int[] result = frontPiece(nums);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] frontPiece(int[] nums) {
        if(nums.length<2){
            return nums;
        }
        int[] result = {nums[0], nums[1]};
        return result;
    }
}
