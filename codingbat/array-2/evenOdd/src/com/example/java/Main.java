package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {0, 1, 1, 0, 0};
        int[] result = evenOdd(a);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] evenOdd(int[] nums) {
        int buffer;
        int numberOfOddValueToExchangeWithEven = -1;//starting number of "value" is negative, because number of an array value can
        //never be negative. It means, that we haven't met any odd numbers yet.
        final int LENGTH_OF_NUMS = nums.length;
        for(int i=0; i<LENGTH_OF_NUMS; i++){
            if(nums[i]%2==1 && numberOfOddValueToExchangeWithEven==-1){//When an odd value is run into first time,
                //we fix the number of the odd value. This branch works out only once
                numberOfOddValueToExchangeWithEven = i;
            } else if(nums[i]%2==0 && numberOfOddValueToExchangeWithEven!=-1){//When an even value is run into, we check,
                //if an odd value has been run into or not. This branch works out, if only it has.
                buffer = nums[i];
                nums[i] = nums[numberOfOddValueToExchangeWithEven];
                nums[numberOfOddValueToExchangeWithEven] = buffer;
                numberOfOddValueToExchangeWithEven++;
            }
        }
        return nums;
    }
}
