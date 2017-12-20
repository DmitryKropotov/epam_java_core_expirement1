package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(xyzThere(".xyzabxyz"));
    }

    public static boolean xyzThere(String str) {
        if(str.length()<3){// preventing StringOutOfBoundsException
            return false;
        }

        if(str.substring(0, 3).equals("xyz")){
            return true;
        }

        for(int i=1; i<str.length()-2; i++){
            if(str.substring(i, i+3).equals("xyz") && str.charAt(i-1)!='.'){
                return true;
            }
        }

        return false;
    }
}
