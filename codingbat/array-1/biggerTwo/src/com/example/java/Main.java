package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a={1, 2}, b={3, 4};
        int[] result=biggerTwo(a, b);
        for(int i: result){
            System.out.println(i);
        }
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        int sumA=a[0]+a[1];
        int sumB=b[0]+b[1];
        if(sumA>=sumB){
            return a;
        }
        else{
            return b;
        }
    }
}
