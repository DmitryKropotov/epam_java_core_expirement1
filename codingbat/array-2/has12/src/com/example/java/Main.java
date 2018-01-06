package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 2, 4};
        System.out.println(has12(a));
    }

    public static boolean has12(int[] nums) {
        boolean is1 = false;
        final int LENGTH_OF_NUMS = nums.length;
        for(int i = 0; i<LENGTH_OF_NUMS; i++){
            if(nums[i]==1){
                is1 = true;
            }
            if(is1 && nums[i]==2){
                return true;
            }
        }
        return false;
    }
}
