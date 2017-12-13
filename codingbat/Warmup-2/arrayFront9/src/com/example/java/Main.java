package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums={1, 2, 9, 3, 3};
        System.out.println(arrayFront9(nums));
    }

    public static boolean arrayFront9(int[] nums) {
        int amountOfCheckedIndexes;
        if(nums.length<4){
            amountOfCheckedIndexes=nums.length;
        }
        else{
            amountOfCheckedIndexes=4;
        }
        for(int i=0; i<amountOfCheckedIndexes; i++){
            if(nums[i]==9){
                return true;
            }
        }
        return false;
    }
}
