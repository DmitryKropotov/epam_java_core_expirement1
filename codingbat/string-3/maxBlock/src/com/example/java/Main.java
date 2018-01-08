package com.example.java;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(maxBlock("hoopla"));
    }


    public static int maxBlock(String str) {
        final int LENGTH_OF_STR = str.length();
        if(LENGTH_OF_STR==0){
            return 0;
        }
        int lengthOfLargestBlock = 1;
        int lengthOfCurrentBlockToCheck = 1;
        char currentSymbolToCheck = str.charAt(0);
        for(int i=1; i<LENGTH_OF_STR; i++) {
            if (str.charAt(i) == currentSymbolToCheck) {
                lengthOfCurrentBlockToCheck++;
                if (i == LENGTH_OF_STR - 1 && lengthOfCurrentBlockToCheck > lengthOfLargestBlock) {
                    lengthOfLargestBlock = lengthOfCurrentBlockToCheck;
                }
            } else {
                if (lengthOfCurrentBlockToCheck > lengthOfLargestBlock) {
                    lengthOfLargestBlock = lengthOfCurrentBlockToCheck;
                }
                 lengthOfCurrentBlockToCheck = 1;
                 currentSymbolToCheck = str.charAt(i);
            }
        }
        return lengthOfLargestBlock;
    }
}
