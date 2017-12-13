package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(fizzString2(15));
    }

    public static String fizzString2(int n) {
        if(n%3==0 && n%5==0){
            return "FizzBuzz!";
        }
        if(n%3==0){
            return "Fizz!";
        }
        if(n%5==0){
            return "Buzz!";
        }
        return n+"!";
    }
}
