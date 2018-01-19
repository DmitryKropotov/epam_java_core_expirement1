package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1, 2 , 1, 1, 3};
        System.out.println(maxSpan(nums));
    }

    public static int maxSpan(int[] nums) {
        int maxSpan = 0;
        int indexOfLastValueAppearance = 0;
        boolean[] alreadyAppeared = new boolean[nums.length];
        for(int i=0; i<nums.length; i++){
            if(alreadyAppeared[i]){
                break;
            } else{
                indexOfLastValueAppearance = i;
            }
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    indexOfLastValueAppearance = j;
                    alreadyAppeared[j] = true;
                }
            }
            if(indexOfLastValueAppearance-i+1>maxSpan){
                maxSpan = indexOfLastValueAppearance-i+1;
            }
        }
        return maxSpan;
    }
}
