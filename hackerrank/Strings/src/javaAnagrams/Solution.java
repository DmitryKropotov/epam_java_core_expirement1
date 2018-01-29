package javaAnagrams;

import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()){//if lengths of a and b are not the same, they are not anagrams
            return false;
        }

        a=a.toLowerCase();
        b=b.toLowerCase();
        final int LENGTH = a.length();
        boolean[] detectedNumbersOfB = new boolean[LENGTH];//default value of boolean is false
        for(int i=0; i<LENGTH; i++){
            for(int j=0; j<LENGTH; j++){//searching for the same character in b, as i(th) character in a
                while(j<LENGTH && detectedNumbersOfB[j]){//miss already detected numbers of characters in b
                    j++;
                }
                if(j==LENGTH){//if j went over wild of allowable range, we have to return false
                    return false;
                }
                if(a.charAt(i)==b.charAt(j)){
                    detectedNumbersOfB[j] = true;
                    break;
                }
                if(j==LENGTH-1){
                    return false;//if 'break' did not happen, when j was <=LENGTH-1, there is an undetected in b character from a
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
