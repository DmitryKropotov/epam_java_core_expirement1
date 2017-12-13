package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(stringE("esd e efwe"));
    }

    public static boolean stringE(String str) {
        int counter=0;
        for (char symbol:str.toCharArray()) {
            if(symbol=='e'){
                counter++;
            }
            if(counter>3){
                return false;
            }
        }
        return counter!=0;
    }
}
