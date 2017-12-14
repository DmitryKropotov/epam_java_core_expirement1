package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={2, 7, 4};
        System.out.println(has271(a));
    }

    public static boolean has271(int[] nums) {
        for(int i=0; i<nums.length-2; i++){
            if(nums[i+1]==nums[i]+5 && Math.abs(nums[i+2]-(nums[i]-1))<=2){
                return true;
            }
        }
        return false;
    }
}
