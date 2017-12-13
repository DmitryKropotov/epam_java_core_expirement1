package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(startOz("oz"));
    }

    public static String startOz(String str) {
        if(str.length()==0 || str.length()==1 && str.charAt(0)!='o'){
            return "";
        }
        if(str.length()==1 && str.charAt(0)=='o'){
            return "o";
        }

        if(str.charAt(0)=='o' && str.charAt(1)!='z'){
            return "o";
        }
        else if(str.charAt(0)!='o' && str.charAt(1)=='z'){
            return "z";
        }
        else if(str.charAt(0)=='o' && str.charAt(1)=='z'){
            return "oz";
        }
        else{
            return "";
        }
    }
}
