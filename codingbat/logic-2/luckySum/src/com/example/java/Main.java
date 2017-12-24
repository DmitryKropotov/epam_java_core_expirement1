package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(luckySum(2, 13, 1));
    }

    public static int luckySum(int a, int b, int c) {
        int sum;
        if(a==13){
            return 0;
        }
        else{
            sum = a;
        }

        if(b==13){
            return sum;
        }
        else{
            sum=sum+b;
        }

        if(c==13){
            return sum;
        }
        else{
            return sum+c;
        }
    }

}
