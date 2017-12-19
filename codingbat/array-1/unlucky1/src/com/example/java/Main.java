package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
     int[] nums = {1, 2, 3};
     System.out.println(unlucky1(nums));
    }

    public static boolean unlucky1(int[] nums) {
        if(nums.length<2 || nums.length==2 && (nums[0]!=1 ||  nums[1]!=3)){
            return false;
        }
        return nums[0]==1 &&  nums[1]==3 || nums[1]==1 &&  nums[2]==3 ||
                nums[nums.length-2]==1 &&  nums[nums.length-1]==3;
    }
}
