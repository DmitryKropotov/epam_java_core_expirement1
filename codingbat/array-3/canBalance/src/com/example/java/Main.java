package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1, 2, 5, -2};
        System.out.println(canBalance(nums));
    }

    public static boolean canBalance(int[] nums) {
        for(int i=1; i<nums.length; i++){
            int leftPart = 0;
            int rightPart = 0;
            for(int j=0; j<i; j++){
                leftPart+=nums[j];
            }
            for(int j=i; j<nums.length; j++){
                rightPart+=nums[j];
            }
            if(leftPart==rightPart){
                return true;
            }
        }
        return false;
    }
}
