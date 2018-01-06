package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 2, 2};
        System.out.println(sum28(a));
    }

    public static boolean sum28(int[] nums) {
        int amountOfTwos = 0;
        final int LENGTH_OF_NUMS = nums.length;
        for(int i=0; i<LENGTH_OF_NUMS; i++){
            if(nums[i]==2){
                amountOfTwos++;
            }
            if(amountOfTwos>4){
                return false;
            }
        }
        return amountOfTwos==4;
    }
}
