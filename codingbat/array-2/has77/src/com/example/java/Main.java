package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 2, 4};
        System.out.println(has77(a));
    }

    public static boolean has77(int[] nums) {
        final int LENGTH_OF_NUMS = nums.length;
        for(int i = 0; i<LENGTH_OF_NUMS-2; i++){
            if(nums[i]==7 && (nums[i+1]==7 || nums[i+2]==7)){
                return true;
            }
        }
        if(LENGTH_OF_NUMS>=3 && nums[LENGTH_OF_NUMS-2]==7 && nums[LENGTH_OF_NUMS-1]==7){
            return true;
        }
        return false;
    }
}
