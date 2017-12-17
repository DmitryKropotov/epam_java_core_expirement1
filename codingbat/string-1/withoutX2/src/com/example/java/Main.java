package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(withoutX2("xxHello"));
    }

    public static String withoutX2(String str) {
        if(str.length()==0 || str.equals("x")) {//preventing OutOfRangeExeption
            return "";
        }
        if(str.length()==1 && !str.equals("x")) {//preventing OutOfRangeExeption
            return str;
        }

        String result="";

        if(str.charAt(0)!='x'){
            result=result+str.substring(0, 1);
        }

        if(str.charAt(1)!='x'){
            result=result+str.substring(1, 2);
        }

        result=result+str.substring(2, str.length());

        return result;
    }
}
