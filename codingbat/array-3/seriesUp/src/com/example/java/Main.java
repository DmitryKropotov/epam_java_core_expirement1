package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] result = seriesUp(3);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] seriesUp(int n) {
        int[] result = new int[n*(n+1)/2];
        int index = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                result[index] = j;
                index++;
            }
        }
        return result;
    }
}
