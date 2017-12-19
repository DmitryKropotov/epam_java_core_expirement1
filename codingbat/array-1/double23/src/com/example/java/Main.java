package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums={2, 4};
        System.out.println(double23(nums));
    }

    public static boolean double23(int[] nums) {
        if(nums.length<2){//preventing ArrayOutOfRange exception
            return false;
        }

        return nums[0]==2 && nums[1]==2 || nums[0]==3 && nums[1]==3;
    }
}
