package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 2, 4};
        System.out.println(either24(a));
    }

    public static boolean either24(int[] nums) {
        boolean isOneStatement = false;
        final int LENGTH_OF_NUMS = nums.length;
        for(int i=0; i<LENGTH_OF_NUMS-1; i++){
            if(nums[i]==2 && nums[i+1]==2 || nums[i]==4 && nums[i+1]==4){
                if(!isOneStatement){
                    isOneStatement = true;
                } else {
                    return false;
                }
            }
        }
        return isOneStatement;
    }
}
