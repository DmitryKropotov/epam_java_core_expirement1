package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int[] nums = {1, 3, 5};
    int[] result = maxEnd3(nums);
    for (int i: result){
        System.out.println(i);
    }
    }

    public static int[] maxEnd3(int[] nums) {
        int maxElementFromFirstAndThird=Math.max(nums[0], nums[2]);

        nums[0]=maxElementFromFirstAndThird;
        nums[1]=maxElementFromFirstAndThird;
        nums[2]=maxElementFromFirstAndThird;

        return nums;
    }
}
