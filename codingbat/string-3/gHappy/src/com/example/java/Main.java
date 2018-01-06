package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(gHappy("xxggx"));
    }

    public static boolean gHappy(String str) {
        final int LENGTH_OF_STR = str.length();
        if(LENGTH_OF_STR==0 || LENGTH_OF_STR==1 && str.charAt(0)!='g'){
            return true;
        }
        if(LENGTH_OF_STR==1 && str.charAt(0)=='g'){
            return false;
        }

        if(str.charAt(0)=='g' && str.charAt(1)!='g'){
            return false;
        }
        for(int i=1; i<LENGTH_OF_STR-1; i++){
            if(str.charAt(i)=='g' && str.charAt(i-1)!='g' && str.charAt(i+1)!='g'){
                return false;
            }
        }
        if(str.charAt(LENGTH_OF_STR-1)=='g' && str.charAt(LENGTH_OF_STR-2)!='g'){
            return false;
        }
        return true;
    }
}
