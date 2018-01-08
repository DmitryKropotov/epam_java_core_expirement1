package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(notReplace("This is right"));
    }

    public static String notReplace(String str) {
        final int LENGTH_OF_STR = str.length();
        if (LENGTH_OF_STR < 2 || LENGTH_OF_STR == 2 && !str.equals("is")) {
            return str;
        }
        if (LENGTH_OF_STR == 2 && str.equals("is")) {
            return "is not";
        }
        String result = (str.substring(0, 2).equals("is") && !Character.isLetter(str.charAt(2))) ? "is not" : str.substring(0, 2);
        for (int i = 2; i < LENGTH_OF_STR - 2; i++) {
            if (str.substring(i, i + 2).equals("is") && !Character.isLetter(str.charAt(i - 1)) && !Character.isLetter(str.charAt(i + 2))) {
                result = result + "is not";
                i++;
            } else {
                result = result + String.valueOf(str.charAt(i));
            }
        }
        result = (str.substring(LENGTH_OF_STR - 2, LENGTH_OF_STR).equals("is") && !Character.isLetter(str.charAt(LENGTH_OF_STR - 3))) ? result + "is not" : result + str.substring(LENGTH_OF_STR - 2, LENGTH_OF_STR);
        return result;
    }
}
