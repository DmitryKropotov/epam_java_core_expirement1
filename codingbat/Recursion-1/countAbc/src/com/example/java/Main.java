package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(countAbc("abcxxabc"));
    }

    public static int countAbc(String str) {
        if(str.length()<3){
            return 0;
        }
        if(str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")){
            return 1+countAbc(str.substring(1, str.length()));
        } else {
            return countAbc(str.substring(1, str.length()));
        }
    }
}
