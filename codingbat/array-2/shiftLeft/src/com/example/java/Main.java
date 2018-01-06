package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 5, 8};
        int[] result = shiftLeft(a);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] shiftLeft(int[] nums) {
        final int LENGTH_OF_ARRAY = nums.length;
        if(LENGTH_OF_ARRAY==0){
            return nums;
        }
        int[] result = new int[LENGTH_OF_ARRAY];
        for(int i=0; i<LENGTH_OF_ARRAY-1; i++){
            result[i] = nums[i+1];
        }
        result[LENGTH_OF_ARRAY-1] = nums[0];
        return result;
    }
}
