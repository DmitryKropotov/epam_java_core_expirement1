package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 3, 4, 3, 3, 1, 3};
        System.out.println(haveThree(a));
    }

    public static boolean haveThree(int[] nums) {
        final int LENGTH_OF_NUMS = nums.length;
        int amountOfThrees = (LENGTH_OF_NUMS!=0 && nums[0]==3) ? 1: 0;
        for(int i=1; i<LENGTH_OF_NUMS; i++){
            if(nums[i]==3){
                if(amountOfThrees<3 && nums[i-1]!=3){
                    amountOfThrees++;
                } else {
                    return false;
                }
            }
        }
        return amountOfThrees==3;
    }
}
