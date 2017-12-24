package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 5, 7 , -1, 8};
        System.out.println(bigDiff(a));
    }

    public static int bigDiff(int[] nums) {
        int maxInNums = nums[0], minInNums = nums[0];

        for(int i: nums){
            maxInNums = Math.max(i, maxInNums);
            minInNums = Math.min(i, minInNums);
        }

        return maxInNums-minInNums;
    }
}
