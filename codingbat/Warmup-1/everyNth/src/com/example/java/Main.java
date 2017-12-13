package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(everyNth("Hello", 2));
    }

    public static String everyNth(String str, int n) {
        String strReturn="";
        for(int i=0; i<str.length(); i=i+n){
            strReturn=strReturn+str.charAt(i);
        }
        return strReturn;
    }
}
