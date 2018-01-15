package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {11, 1, 2, 11, 2, 4, 11};
        System.out.println(array11(nums, 0));
    }

    public static int array11(int[] nums, int index) {
        if(nums.length==0){
            return 0;
        }
        if(index==nums.length-1){
            if(nums[index]==11){
                return 1;
            } else{
                return 0;
            }
        }
        if(nums[index]==11){
            return 1+array11(nums, index+1);
        } else{
            return array11(nums, index+1);
        }
    }
}
