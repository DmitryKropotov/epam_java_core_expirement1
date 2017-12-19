package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums={1, 2 ,3};
        int[] result=rotateLeft3(nums);
        for (int i: result){
            System.out.println(i);
        }
    }

    public static int[] rotateLeft3(int[] nums) {
        int[] result={nums[1], nums[2], nums[0]};
        return result;
    }
}
