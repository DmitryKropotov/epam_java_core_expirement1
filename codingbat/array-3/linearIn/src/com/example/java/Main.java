package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] outer = {1, 3, 4, 5, 7};
        int[] inner = {1, 3, 7};
        System.out.println(linearIn(outer, inner));
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        for(int i: inner){
            if(!isInArray(i, outer)){
                return false;
            }
        }
        return true;
    }

    static boolean isInArray(int a, int[] nums){
        int numberOfAInArray = nums.length/2;
        int lowerBoundary = 0;
        int higherBoundary = nums.length-1;
        while(nums[numberOfAInArray]!=a){
            if(nums[numberOfAInArray]>a){
                higherBoundary = numberOfAInArray-1;
            }
            if(nums[numberOfAInArray]<a){
                lowerBoundary = numberOfAInArray+1;
            }
            if(higherBoundary-lowerBoundary<0){
                return false;
            } else{
                numberOfAInArray = (higherBoundary+lowerBoundary)/2;
            }
        }
        return true;
    }
}
