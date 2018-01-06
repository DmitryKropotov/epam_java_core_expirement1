package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 5, 8};
        int[] result = notAlone(a, 5);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] notAlone(int[] nums, int val) {
        final int LENGTH_OF_NUMS = nums.length;
        for(int i=1; i<LENGTH_OF_NUMS-1; i++){
            if(nums[i]==val && nums[i-1]!=val && nums[i+1]!=val){
                nums[i] = Math.max(nums[i-1], nums[i+1]);
            }
        }
        return nums;
    }
}
