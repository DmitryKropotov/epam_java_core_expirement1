package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 2, 2};
        System.out.println(lucky13(a));
    }

    public static boolean lucky13(int[] nums) {
        final int LENGTH_OF_NUMS = nums.length;
        for(int i=0; i<LENGTH_OF_NUMS; i++){
            if(nums[i]==1 || nums[i]==3){
                return false;
            }
        }
        return true;
    }
}
