package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 10, 5, 10};
        int[] result = withoutTen(a);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] withoutTen(int[] nums) {
        int numberOf10ToExchangeWithNot10 = -1;//starting number of "value", where 10 is, is negative, because number of
        //an array value can never be negative. It means, that we haven't met any 10's in array yet.
        final int LENGTH_OF_NUMS = nums.length;
        for(int i=0; i<LENGTH_OF_NUMS; i++){
            if(nums[i]==10){
                if(numberOf10ToExchangeWithNot10==-1){//When a '10' is run into first time,
                    //we fix the array number of the '10'. This part of branch 'if(nums[i]==10)' works out only once
                    numberOf10ToExchangeWithNot10 = i;
                }
                nums[i]=0;
            } else if(nums[i]!=10 && numberOf10ToExchangeWithNot10!=-1){
                nums[numberOf10ToExchangeWithNot10] = nums[i];
                nums[i] = 0;
                numberOf10ToExchangeWithNot10++;
            }
        }
        return nums;
    }
}
