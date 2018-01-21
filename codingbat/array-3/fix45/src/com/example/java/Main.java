package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {5, 9, 4, 5, 4, 5};
        int [] result = fix45(nums);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] fix45(int[] nums) {
        int first4 = 0;
        while(first4<nums.length && nums[first4]!=4){
            first4++;
        }
        if(first4==nums.length){//if there is no 4 in the array, return it without changing
            return nums;
        }

        int index = nums.length-1;
        while(index>=0 && (nums[index]==4 || nums[index]==5)){//searching for first not 4 and not 5, starting since the end of array
            index--;
        }
        if(index==-1){//it means that array contains only 4s and 5s
            return nums;
        }
        int valueToChange5s = nums[index];
        for(int i=0; i<first4; i++){//change all 5s since beginning before first 4
            if(nums[i]==5){
                nums[i] = valueToChange5s;
            }
        }
        outer:
        for(int i=first4; i<nums.length-1; i++){
            if(nums[i]==4){// we do something, if we run into 4
                if(nums[i+1]!=5){//if next value is not 5, we save the value and replace it by 5
                    valueToChange5s = nums[i+1];
                    nums[i+1] = 5;
                }
                int j = i+2;//we have to start inner circle since value, following the 4
                if(i==nums.length-2 || nums[j]==4){//if there is nothing(i==nums.length-2) or there is 3(nums[j]==3)
                    //we continue outer circle, making i number, followed by j
                    i=j-1;
                    continue;
                }
                do{//we finish inner circle, if we achieved the end of the array or 4
                    if(nums[j]==5){//if we run into one 5, we replace it and all following 5s by the saving value to change 5s
                        //and continue outer circle, making i number of next 4, if it exists
                        do{
                            if(nums[j]==5){
                                nums[j] = valueToChange5s;
                            }
                            j++;
                        }while(j<nums.length && nums[j]!=4);
                        i=j-1;
                        continue outer;
                    } else {//if it is not 5, we change the saving value to change 5s
                        valueToChange5s = nums[j++];
                    }
                }while(j<nums.length && nums[j]!=4);
                i=j-1;//we make i the number, followed by 4, before we move to the new iteration of the outer loop
            }
        }
        return nums;
    }
}
