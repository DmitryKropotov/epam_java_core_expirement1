package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {3, 2, 3, 2, 4, 4};
        int[] result = fix34(nums);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] fix34(int[] nums) {
        int valueToChange4s = 0;//this value doesn't mean anything, it is here just to satisfy the compiler
        outer:
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==3){// we do something, if we run into 3
                if(nums[i+1]!=4){//if next value is not 4, we save the value and replace it by 4
                    valueToChange4s = nums[i+1];
                    nums[i+1] = 4;
                }
                int j = i+2;//we have to start inner circle since value, following the 4
                if(i==nums.length-2 || nums[j]==3){//if there is nothing(i==nums.length-2) or there is 3(nums[j]==3)
                    //we continue outer circle, making i number, followed by j
                    i=j-1;
                    continue;
                }
                do{//we finish inner circle, if we achieved the end of the array or 3
                    if(nums[j]==4){//if we run into one 4, we replace it and all following 4s by the saving value to change 4s
                        //and continue outer circle, making i number of next 3, if it exists
                        do{
                            if(nums[j]==4){
                                nums[j] = valueToChange4s;
                            }
                            j++;
                        }while(j<nums.length && nums[j]!=3);
                        i=j-1;
                        continue outer;
                    } else {//if it is not 4, we change the saving value to change 4s
                        valueToChange4s = nums[j++];
                    }
                }while(j<nums.length && nums[j]!=3);
                i=j-1;//we make i the number, followed by 3, before we move to the new iteration of the outer loop
            }
        }
        return nums;
    }
}
