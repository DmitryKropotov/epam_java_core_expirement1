package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(equalIsNot("isisnotnot"));
    }

    public static boolean equalIsNot(String str) {
        final int LENGTH_OF_STR = str.length();
        if(LENGTH_OF_STR<2){
            return true;
        }
        int amountOfIs = 0, amountOfNot = 0;
        for(int i=0; i<LENGTH_OF_STR-2; i++){
            if(str.substring(i, i+2).equals("is")){
                amountOfIs++;
            }
            if(str.substring(i, i+3).equals("not")){
                amountOfNot++;
            }
        }
        if(str.substring(LENGTH_OF_STR-2, LENGTH_OF_STR).equals("is")){
            amountOfIs++;
        }
        return amountOfIs==amountOfNot;
    }
}
