package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums={5, 6, 2};
        System.out.println(groupSum6(0, nums, 8));
    }

    public static boolean groupSum6(int start, int[] nums, int target) {
        if(target==0){
            if(!isSixFurther(start, nums)){
                return true;
            } else{
                return false;
            }
        }
        if(start==nums.length){
            return false;
        }
        if(nums[start]==6){
            return groupSum6(start+1, nums, target-nums[start]);
        } else {
            return groupSum6(start+1, nums, target-nums[start]) ||  groupSum6(start+1, nums, target);
        }
    }

    static boolean isSixFurther(int start, int[] nums){
        if(start>nums.length-1){
            return false;
        }else if(nums[start]==6){
            return true;
        }
        else{
            return isSixFurther(start+1, nums);
        }
    }
}
