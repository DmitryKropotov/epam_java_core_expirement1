package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={1, 2};
        int[] result=swapEnds(a);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] swapEnds(int[] nums) {
        int firstElementOfNums=nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]=firstElementOfNums;
        return nums;
    }
}
