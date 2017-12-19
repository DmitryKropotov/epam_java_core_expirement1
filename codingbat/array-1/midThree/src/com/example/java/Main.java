package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={1, 2, 3, 4, 5};
        int[] result=midThree(a);
        for(int i: result){
            System.out.println(i);
        }
    }


    public static int[] midThree(int[] nums) {
        int[] result = {nums[nums.length/2-1], nums[nums.length/2], nums[nums.length/2+1]};
        return result;
    }
}
