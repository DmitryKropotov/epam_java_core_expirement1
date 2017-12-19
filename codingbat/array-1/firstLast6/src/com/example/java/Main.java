package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[]={1, 1, 6};
        System.out.println(firstLast6(a));
    }

    public static boolean firstLast6(int[] nums) {
        return nums[0]==6 || nums[nums.length-1]==6;
    }
}
