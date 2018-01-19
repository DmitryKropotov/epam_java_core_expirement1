package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] result = squareUp(5);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] squareUp(int n) {
        int[] result = new int[n*n];
        int index = 0;
        for(int i=0; i<n; i++){
            for(int j=n; j>0; j--){
                result[index]=(j>i+1) ? 0: j;
                index++;
            }
        }
        return result;
    }
}
