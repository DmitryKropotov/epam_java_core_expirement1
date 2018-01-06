package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 0, 9, 0, 2};
        int[] result = zeroMax(a);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] zeroMax(int[] nums) {
        int maxOddValue = 0;//starting odd value isn't odd to get to know that it is starting
        final int LENGTH_OF_NUMS = nums.length;
        for(int i=LENGTH_OF_NUMS-1; i>=0; i--){
            if(nums[i]%2==1 && (nums[i]>maxOddValue || maxOddValue==0)){
                maxOddValue = nums[i];
            }
            if(nums[i]==0 && maxOddValue!=0){
                nums[i]=maxOddValue;
            }
        }
        return nums;
    }
}
