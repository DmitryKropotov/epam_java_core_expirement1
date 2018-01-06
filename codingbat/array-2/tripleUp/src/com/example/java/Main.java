package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 4, 5, 6};
        System.out.println(tripleUp(a));
    }

    public static boolean tripleUp(int[] nums) {
        final int LENGTH_OF_NUMS = nums.length;
        for(int i=0; i<LENGTH_OF_NUMS-2; i++){
            if(nums[i+1]-nums[i]==1 && nums[i+2]-nums[i+1]==1){
                return true;
            }
        }
        return false;
    }
}
