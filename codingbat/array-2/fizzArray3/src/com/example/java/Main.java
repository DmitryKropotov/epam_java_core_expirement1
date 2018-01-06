package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = fizzArray3(2, 5);
        for(int i: a){
            System.out.println(i);
        }
    }

    public static int[] fizzArray3(int start, int end) {
        int result[] = new int[end-start];
        for(int i=0; i<end-start; i++){
            result[i] = start+i;
        }
        return result;
    }
}
