package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(oneTwo("abc123"));
    }

    public static String oneTwo(String str) {
        char firstSymbolOfThree;

        if(str.length()<3){//in this case we return "" here to prevent non-performing loop and returning unchanged str
            return "";
        }

        for(int i = 0; i<str.length()/3*3; i=i+3){
            firstSymbolOfThree=str.charAt(i);
            str=str.substring(0, i)+str.substring(i+1, i+3)+String.valueOf(firstSymbolOfThree)+str.substring(i+3, str.length()/3*3);
        }

        return str;
    }
}
