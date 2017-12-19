package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums={2, 3, 1};
        int[] result=makeEnds(nums);
        for (int i: result){
            System.out.println(i);
        }
    }

    public static int[] makeEnds(int[] nums) {
        int[] result = {nums[0], nums[nums.length-1]};
        return result;
    }
}
