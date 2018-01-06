package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 20, 5, 80};
        int[] result = tenRun(a);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] tenRun(int[] nums) {
        int multipleOf10 = 1;//starting value isn't multiple of 10, that means that value of array isn't supposed to be changed
        final int LENGTH_OF_NUMS = nums.length;
        for(int i=0; i<LENGTH_OF_NUMS; i++){
            if(nums[i]%10==0){
                multipleOf10 = nums[i];
            }
            if(multipleOf10!=1){
                nums[i] = multipleOf10;
            }
        }
        return nums;
    }
}
