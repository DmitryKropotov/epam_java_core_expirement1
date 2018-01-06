package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 2, 4};
        System.out.println(no14(a));
    }

    public static boolean no14(int[] nums) {
        boolean is1 = false, is4 = false;
        final int LENGTH_OF_NUMS = nums.length;
        for(int i=0; i<LENGTH_OF_NUMS; i++){
            if(nums[i]==1 && is4 || nums[i]==4 && is1){
                return false;
            }
            if(nums[i]==1){
                is1 = true;
            }
            if(nums[i]==4){
                is4 = true;
            }
        }
        return true;
    }
}
