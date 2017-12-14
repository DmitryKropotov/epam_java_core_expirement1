package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={6, 6, 6, 7};
        System.out.println(array667(a));
    }

    public static int array667(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==6 && (nums[i+1]==6 || nums[i+1]==7)){
                result++;
            }
        }
        return result;
    }
}
