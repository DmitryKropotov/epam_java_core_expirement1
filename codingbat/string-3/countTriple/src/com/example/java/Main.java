package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(countTriple("XXX"));
    }

    public static int countTriple(String str) {
        final int LENGTH_OF_STR = str.length();
        if(LENGTH_OF_STR<3){
            return 0;
        }
        int amountOfTriples = 0;
        for(int i=0; i<LENGTH_OF_STR-2; i++){
            if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2)){
                amountOfTriples++;
            }
        }
        return amountOfTriples;
    }
}
