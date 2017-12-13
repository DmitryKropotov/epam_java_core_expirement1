package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(fizzString("fafasdb"));
    }

    public static String fizzString(String str) {
        if(str.startsWith("f") && !str.endsWith("b")){
            return "Fizz";
        }
        if(!str.startsWith("f") && str.endsWith("b")){
            return "Buzz";
        }
        if(str.startsWith("f") && str.endsWith("b")){
            return "FizzBuzz";
        }
        return str;
    }
}
