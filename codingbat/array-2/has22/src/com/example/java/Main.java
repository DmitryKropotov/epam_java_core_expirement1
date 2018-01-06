package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 2, 2};
        System.out.println(has22(a));
    }

    public static boolean has22(int[] nums) {
        final int LENGTH_OF_NUMS = nums.length;
        for(int i=0; i<LENGTH_OF_NUMS-1; i++){
            if(nums[i]==2 && nums[i+1]==2){
                return true;
            }
        }
        return false;
    }

}
