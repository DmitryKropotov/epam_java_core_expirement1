package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums={1, 9, 1, 3, 2};
        System.out.println(array123(nums));
    }

    public static boolean array123(int[] nums) {
        for(int i=0; i<nums.length-2; i++){
            if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3){
                return true;
            }
        }
        return false;
    }
}
