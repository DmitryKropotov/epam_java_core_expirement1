package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 2, 1};
        System.out.println(sameEnds(a, 4));
    }

    public static boolean sameEnds(int[] nums, int len) {
        final int LENGTH_OF_NUMS = nums.length;
        for(int i=0; i<len; i++){
            if(nums[i]!=nums[LENGTH_OF_NUMS-len+i]){
                return false;
            }
        }
        return true;
    }
}
