package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 3, 3};
        System.out.println(countClumps(nums));
    }

    public static int countClumps(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int result = 0;
        for(int i=0; i<nums.length-1; i++){
            int lastValue = nums[i];
            if(nums[i+1]==lastValue){
                result++;
                while(i<nums.length-1 && nums[i+1]==lastValue){
                    i++;
                }
            }
        }
        return result;
    }
}
