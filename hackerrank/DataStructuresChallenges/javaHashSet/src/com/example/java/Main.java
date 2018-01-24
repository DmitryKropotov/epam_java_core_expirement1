package com.example.java;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        // write your code here
        Set<String> setOfPairs = new HashSet<>();
        int uniquePairs = 0;
        for(int i = 0; i < t; i++){
            if (setOfPairs.add(pair_left[i]+" "+pair_right[i])) {
                uniquePairs++;
            }
            System.out.println(uniquePairs);
        }
    }
}
