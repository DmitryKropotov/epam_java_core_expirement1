package com.example.java;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1, 1, 1, 1};
        System.out.println(maxMirror(nums));
    }

    public static int maxMirror(int[] nums) {
        int result = 0;
        veryBeginningOfCircles:
        for(int i=1; i<=nums.length; i++){//amount of elements in a "mirror"
            for(int j=0; j<=nums.length-i; j++){//index of first element of the "mirror"
                for(int k=nums.length-1; k>=i-1; k--){//index of first element of refraction of the "mirror"
                    for(int l=0; l<i; l++){
                        if(nums[j+l]!=nums[k-l]){
                            break;
                        }
                        if(l==i-1){
                            result = i;
                            continue veryBeginningOfCircles;
                        }
                    }
                }
            }
        }
        return result;
    }
}
