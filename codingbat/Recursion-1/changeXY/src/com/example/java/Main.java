package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(changeXY("x0isXsdy"));
    }

    public static String changeXY(String str) {
        if(str.length()==0){
            return "";
        }
        if(str.charAt(0)=='x'){
            return 'y'+changeXY(str.substring(1, str.length()));
        } else {
            return str.charAt(0)+changeXY(str.substring(1, str.length()));
        }
    }
}
