package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] a = {1, 2, 6, 100, 7, 1};
        System.out.println(sum67(a));
    }

    public static int sum67(int[] nums) {
        int sum = 0;
        final int LENGTH_OF_NUMS = nums.length;
        boolean ignore = false;
        for(int i=0; i<LENGTH_OF_NUMS; i++){

            if(nums[i]!=6 && !ignore){//if the number isn't 6 and "ignore" is off, we add the number to the sum
                sum = sum+nums[i];
            } else{//if  there is 6, we switch "ignore" on
                ignore = true;
            }

            if(ignore && nums[i]==7){//if "ignore" is on and there is 7, we switch "ignore" off
                ignore = false;
            }
        }
        return sum;
    }
}
