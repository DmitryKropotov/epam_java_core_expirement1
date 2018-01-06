package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] result = fizzBuzz(3, 16);
        for(String i: result){
            System.out.println(i);
        }
    }

    public static String[] fizzBuzz(int start, int end) {
        String[] result = new String[end-start];
        for(int i=start; i<end; i++){
            result[i-start] = (i%3==0 && i%5==0) ? "FizzBuzz": i%3==0 ? "Fizz": i%5==0 ? "Buzz": String.valueOf(i);
        }
        return result;
    }
}
