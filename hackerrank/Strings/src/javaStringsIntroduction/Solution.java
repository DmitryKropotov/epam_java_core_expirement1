package javaStringsIntroduction;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        final int LENGTH_OF_A = A.length(), LENGTH_OF_B = B.length();

        String ALexicographicallyLarger;
        if(LENGTH_OF_A>LENGTH_OF_B){//starting ALexicographicallyLarger's value is like finishing value is if first Math.min(LENGTH_OF_A, LENGTH_OF_B) characters in A AND B are the same
            ALexicographicallyLarger = "Yes";
        } else{
            ALexicographicallyLarger = "No";
        }

        for(int i=0; i<Math.min(LENGTH_OF_A, LENGTH_OF_B); i++){//defining finishing value of aLexicographicallyLarger
            if(A.charAt(i)>B.charAt(i)){
                ALexicographicallyLarger = "Yes";
                break;
            } else if(A.charAt(i)<B.charAt(i)){
                ALexicographicallyLarger = "No";
                break;
            }
        }

        A=A.substring(0, 1).toUpperCase()+A.substring(1, LENGTH_OF_A);
        B=B.substring(0, 1).toUpperCase()+B.substring(1, LENGTH_OF_B);
        System.out.println(LENGTH_OF_A+LENGTH_OF_B);
        System.out.println(ALexicographicallyLarger);
        System.out.println(A+" "+B);

        sc.close();
    }
}
