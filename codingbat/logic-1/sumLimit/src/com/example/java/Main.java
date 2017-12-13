package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumLimit(1, 2));
    }

    public static int sumLimit(int a, int b) {
        int sum=a+b;
        String strA=String.valueOf(a);
        String strSum=String.valueOf(sum);
        if(strA.length()==strSum.length()){
            return sum;
        }
        else{
            return a;
        }
    }
}
