package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(countYZ("day fyyyZ"));

    }

    public static int countYZ(String str) {
        int result = 0;
        final int LENGTH_OF_STR = str.length();
        for(int i=0; i<LENGTH_OF_STR-1; i++){
            if((str.charAt(i)=='y' || str.charAt(i)=='Y' || str.charAt(i)=='z' || str.charAt(i)=='Z')
                    && !Character.isLetter(str.charAt(i+1))){
                result++;
            }
        }
        if(str.charAt(LENGTH_OF_STR-1)=='y' || str.charAt(LENGTH_OF_STR-1)=='Y'
                || str.charAt(LENGTH_OF_STR-1)=='z' || str.charAt(LENGTH_OF_STR-1)=='Z'){
            result++;
        }
        return result;
    }
}
