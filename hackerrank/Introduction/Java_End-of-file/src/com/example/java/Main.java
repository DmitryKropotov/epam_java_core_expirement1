package com.example.java;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String line;
        int counter = 1;
        while(sc.hasNext()){
            line = sc.nextLine();
            System.out.println(counter+" "+line);
            counter++;
        }
        sc.close();
    }
}
