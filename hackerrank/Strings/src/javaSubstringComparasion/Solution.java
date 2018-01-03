package javaSubstringComparasion;

import java.util.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        final int LENGTH_OF_S = s.length();
        for(int i=0; i<LENGTH_OF_S-k+1; i++){
            String nextSubstring = s.substring(i, i+k);
            if(i==0){//When we have first iteration of loop, 'smallest' should be changed from "" to smth (let it be first substring of length 'k'),
                //else next "if" would never give true and "" would be returned as smallest substring of length 'k'
                smallest = nextSubstring;
            }
            if(nextSubstring.compareTo(smallest)<0){
                smallest = nextSubstring;
            }
            if(nextSubstring.compareTo(largest)>0){
                largest = nextSubstring;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
