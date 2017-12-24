package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 100};
        System.out.println(centeredAverage(a));
    }

    public static int centeredAverage(int[] nums) {
        int numberOfMin = 0, numberOfMax = 0;
        int minValue = nums[0],  maxValue = nums[0];
        final int LENGTH_OF_NUMS = nums.length;

        for(int i=1; i<LENGTH_OF_NUMS; i++){//searching for min and max elements of array and their numbers
            if(nums[i]<minValue){
                minValue = nums[i];
                numberOfMin = i;
            }

            if(nums[i]>maxValue){
                maxValue = nums[i];
                numberOfMax = i;
            }
        }

        if(numberOfMin==numberOfMax){//in this case all elements of array are same
            return nums[0];//Middle value of any elements is the value of an element
        }

        int sum=0;//counting sum of array's elements without min and max elements
        for(int i=0; i<LENGTH_OF_NUMS; i++){
            if(i!=numberOfMin && i!=numberOfMax){
                sum = sum+nums[i];
            }
        }

        return sum/(LENGTH_OF_NUMS-2);
    }
}
