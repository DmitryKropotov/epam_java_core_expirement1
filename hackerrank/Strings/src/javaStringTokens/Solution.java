package javaStringTokens;

import org.jetbrains.annotations.Contract;

import java.util.*;

public class Solution {

    @Contract(pure = true)
    public static boolean isLetter(char q){
        return q>='A' && q<='Z' || q>='a' && q<='z';
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        final int LENGTH_OF_S = s.length();
        String[] tokens = new String[LENGTH_OF_S/2+1];
        int counter = 0;
        int indexOfBeginningOfNextToken = 0;
        boolean makingAToken = false;
        for(int i=0; i<LENGTH_OF_S; i++){
            if(isLetter(s.charAt(i))){
                if(!makingAToken){
                    indexOfBeginningOfNextToken = i;
                    makingAToken = true;
                }
                if(i==LENGTH_OF_S-1){
                    tokens[counter] = s.substring(indexOfBeginningOfNextToken, i+1);
                    counter++;
                }
            } else if(makingAToken){
                tokens[counter] = s.substring(indexOfBeginningOfNextToken, i);
                counter++;
                makingAToken = false;
            }
        }

        System.out.println(counter);
        for(int i = 0; i<counter; i++){
            System.out.println(tokens[i]);
        }

        scan.close();
    }
}
