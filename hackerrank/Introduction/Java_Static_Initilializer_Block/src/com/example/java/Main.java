package com.example.java;
import java.util.*;

public class Main {

    //Write your code here
    static int B, H;
    static boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args) {
	// write your code here
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
