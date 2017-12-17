package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasBad("badly"));
    }

    public static boolean hasBad(String str) {
        //Checking, if length of str isn't fewer 3 or is 3 and there is no "bad".
        if(str.length()<3 || str.length()==3 && !str.equals("bad")){
            return false;
        }

        //If length of str is 3 and there is no "bad", next line will give
        //outOfRange exeption, when checking second condition
        return str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad");
    }

}
