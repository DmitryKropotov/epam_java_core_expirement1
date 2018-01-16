package com.example.java;

import java.util.*;

public class Main {

    /*1 33 3321=3355
    16 3123 3=6478
    343 34234 3123=44178
     */
    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int result = -63;//-9*7(minimal possible sum)
        for(int i=0; i<4; i++){//line of beginning of a hourglass
            for(int j=0; j<4; j++){//column of beginning of a hourglass
                int sum = 0;//start new hourglass
                for(int k=j; k<j+3; k++){//line in hourglass
                    if(k==j+1){
                        sum+=arr[k][i+1];
                    } else{
                        for(int l=i; l<i+3; l++){//column in hourglass
                            sum+=arr[k][l];
                        }
                    }
                }
                //sum counting in a hourglass is finished
                if(sum>result){
                    result = sum;
                }
                //moving to count sum of new hourglass
            }
        }
        System.out.println(result);
    }
}
