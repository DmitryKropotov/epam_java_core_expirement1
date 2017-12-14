package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[]={1, 1, 2, 2, 2, 3, 3};
        System.out.println(noTriples(a));
    }

    public static boolean noTriples(int[] nums) {
        for(int i=0; i<nums.length-2; i++){
            if(nums[i]==nums[i+1] && nums[i]==nums[i+2]){
                return false;
            }
        }
        return true;
    }
}
