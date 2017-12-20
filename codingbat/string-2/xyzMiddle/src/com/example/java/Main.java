package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(xyzMiddle("ooxyzo"));
    }

    public static boolean xyzMiddle(String str) {
        final int LENGTH_OF_STR=str.length();
        final int LENGTH_OF_XYZ=3;

        if(LENGTH_OF_STR<LENGTH_OF_XYZ){//preventing StringOutOfBoundsException
            return false;
        }

        //I found x, sutisfied equation |(x-1)-(LENGTH_OF_STR-(x+2))|<=1, x - place of first char of "xyz",
        //1 - place of first char of str, LENGTH_OF_STR - place of last char of str, x+2 - place of last char of "xyz"
        //I found two cases as you can see below. Following description of function "substring", I substracted 1 from x

        //case 1: LENGTH_OF_STR can be both EVEN or ODD
        return    (str.substring(LENGTH_OF_STR/2-1, LENGTH_OF_STR/2+2).equals("xyz")
        //case 2: LENGTH_OF_STR can be ONLY EVEN
        || LENGTH_OF_STR%2==0 && str.substring(LENGTH_OF_STR/2-2, LENGTH_OF_STR/2+1).equals("xyz"));
    }
}
