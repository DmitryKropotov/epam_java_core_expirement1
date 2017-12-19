package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums={2, 3, 1};
        int[] result=fix23(nums);
        for (int i: result){
            System.out.println(i);
        }
    }

    public static int[] fix23(int[] nums) {
        if(nums[0]==2 && nums[1]==3){
            nums[1]=0;
            return nums;
        }
        if(nums[1]==2 && nums[2]==3){
            nums[2]=0;
            return nums;
        }
        return nums;
    }
}
