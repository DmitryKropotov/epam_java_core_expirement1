package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(missingChar("Hello", 2));
    }

    public static String missingChar(String str, int n) {
        char[] strCopy=str.toCharArray();
        int lengthOfStr=str.length();
        char[] newStrCopy=new char[lengthOfStr-1];
        for(int i=0; i<lengthOfStr-1; i++){
            if(i<n) {
                newStrCopy[i] = strCopy[i];
            }
            else{
                newStrCopy[i] = strCopy[i+1];
            }
        }
        str=new String(newStrCopy);
        return str;
    }
}
