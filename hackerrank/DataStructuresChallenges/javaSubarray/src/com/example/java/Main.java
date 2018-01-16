package com.example.java;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        int result = 0;
        for(int i=1; i<=n; i++){//amount of elements in subarray (from 1 to n)
            for(int j=0; j<=n-i; j++){//index of beginning of subarray (from 0 to n-i)
                int sum = 0;
                for(int k=j; k<j+i; k++){//index of element to add to sum
                    sum+=a[k];
                }
                if(sum<0){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
