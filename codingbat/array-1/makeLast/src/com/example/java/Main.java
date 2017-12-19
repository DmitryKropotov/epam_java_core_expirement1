package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums={1, 2};
        int[] result=makeLast(nums);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] makeLast(int[] nums) {
        int[] result = new int[2*nums.length];
        result[2*nums.length-1]=nums[nums.length-1];
        return result;
    }
}
