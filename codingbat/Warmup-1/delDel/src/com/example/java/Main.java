package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(delDel("Edelxit"));
    }

    public static String delDel(String str) {
        if(str.length()<4){
            return str;
        }
        if(str.substring(1, 4).equals("del")){
            return str.replaceFirst("del", "");
        }
        return str;
    }
}
