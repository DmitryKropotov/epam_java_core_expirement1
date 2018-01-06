package com.example.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 5, 8};
        int[] result = post4(a);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] post4(int[] nums){
        final int LENGTH_OF_NUMS = nums.length;
        int numberOfFour=LENGTH_OF_NUMS;
        for(int i = LENGTH_OF_NUMS-1; i>=0; i--){
            if(nums[i]==4){
                numberOfFour = i;
                break;
            }
        }
        nums = Arrays.copyOfRange(nums, numberOfFour+1, LENGTH_OF_NUMS);
        return nums;
    }
}
