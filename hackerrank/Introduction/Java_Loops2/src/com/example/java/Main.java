package com.example.java;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s=a+b;
            for(int j=1; j<=n; j++){
                System.out.print(s);
                if(j!=n){
                    System.out.print(" ");
                }
                else{
                    System.out.println();
                }
                s=s+(int)Math.pow(2.0, (double)j)*b;
            }
        }
        in.close();
    }
}
