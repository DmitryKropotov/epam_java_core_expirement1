package com.example.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 4, 8};
        int[] result = pre4(a);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] pre4(int[] nums){
        final int LENGTH_OF_NUMS = nums.length;
        int numberOfFour=LENGTH_OF_NUMS;
        for(int i = 0; i<LENGTH_OF_NUMS; i++){
            if(nums[i]==4){
                numberOfFour = i;
                break;
            }
        }
        nums = Arrays.copyOf(nums, numberOfFour);
        return nums;
    }
}
