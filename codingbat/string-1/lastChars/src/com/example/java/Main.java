package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(lastChars("Hello", "Goodbye"));
    }

    public static String lastChars(String a, String b) {
        String result="";
        if(a.length()==0){
            result=result+"@";
        }
        else{
            result=result+a.substring(0, 1);
        }

        if(b.length()==0){
            result=result+"@";
        }
        else{
            result=result+b.substring(b.length()-1, b.length());
        }
        return result;

    }
}
