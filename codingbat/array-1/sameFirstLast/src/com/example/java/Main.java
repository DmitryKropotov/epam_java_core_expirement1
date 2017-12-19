package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[]={1, 2, 1};
        System.out.println(sameFirstLast(a));
    }

    public static boolean sameFirstLast(int[] nums) {
        return nums.length>0 && nums[0]==nums[nums.length-1];
    }
}
