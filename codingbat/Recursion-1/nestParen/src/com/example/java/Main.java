package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(nestParen("(yy)"));
    }

    public static boolean nestParen(String str) {
        if(str.equals("()")){
            return true;
        }
        if(str.equals("(") || str.equals(")") || str.charAt(0)!='(' && str.charAt(0)!=')'){
            return false;
        }
        if(str.charAt(0)!='('){
            return nestParen(str.substring(1, str.length()));
        }
        if(str.charAt(str.length()-1)!=')'){
            return nestParen(str.substring(0, str.length()-1));
        }
        //if(str.charAt(0)=='(' && str.charAt(str.length())==')')
        return nestParen(str.substring(1, str.length()-1));
    }
}
