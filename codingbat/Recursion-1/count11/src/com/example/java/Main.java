package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(count11("11da11"));
    }

    public static int count11(String str) {
        if(str.length()<2){
            return 0;
        }
        if(str.substring(0, 2).equals("11")){
            return 1+count11(str.substring(2, str.length()));
        } else {
            return count11(str.substring(1, str.length()));
        }
    }
}
