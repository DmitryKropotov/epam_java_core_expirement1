package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 0, 1, 0};
        int[] result = zeroFront(a);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] zeroFront(int[] nums) {
        int amountOfZeros = 0;
        final int LENGTH_OF_NUMS = nums.length;
        for(int i=0; i<LENGTH_OF_NUMS; i++){
            if(nums[i]==0){
                nums[i] = nums[amountOfZeros];
                nums[amountOfZeros] = 0;
                amountOfZeros++;
            }
        }
        return nums;
    }
}
