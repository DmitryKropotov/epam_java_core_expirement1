package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getSandwich("obread"));
    }

    public static String getSandwich(String str) {
        final int CHARS_IN_BREAD = 5;
        final int firstCharInBeetween = str.indexOf("bread") + CHARS_IN_BREAD, lastCharInBetween = str.lastIndexOf("bread");

        if(firstCharInBeetween==CHARS_IN_BREAD-1 || firstCharInBeetween>lastCharInBetween){//if there is no "bread"(case 1) or one appearance of "bread", return ""
            return "";
        }

        return str.substring(firstCharInBeetween, lastCharInBetween);
    }
}
