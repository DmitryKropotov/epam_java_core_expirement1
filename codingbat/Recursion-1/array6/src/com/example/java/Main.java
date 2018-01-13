package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 6, 89, 66, 6};
        System.out.println(array6(a, 0));
    }

    public static boolean array6(int[] nums, int index) {
        if(nums.length==0){
            return false;
        }
        if(nums[index]==6){
            return true;
        }
        if(index==nums.length-1){
            return false;
        }
        return array6(nums, index+1);
    }
}
