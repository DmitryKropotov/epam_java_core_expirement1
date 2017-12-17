package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(atFirst("hahohe"));

    }

    public static String atFirst(String str) {
        String result;
        switch(str.length()){
            case 0: result="@@";
            break;
            case 1: result=str.substring(0, 1)+"@";
            break;
            default: result=str.substring(0, 2);
        }
        return result;
    }
}
