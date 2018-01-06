package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 2, 4};
        System.out.println(isEverywhere(a, 2));
    }

    public static boolean isEverywhere(int[] nums, int val) {
        final int LENGTH_OF_NUMS = nums.length;
        if(LENGTH_OF_NUMS==0 || LENGTH_OF_NUMS==1){
            return true;
        }

        for(int i=0; i<LENGTH_OF_NUMS-1; i++){//check for elements since second before penultimate
            if(nums[i]!=val && nums[i+1]!=val){
                return false;
            }
        }

        return true;
    }
}
