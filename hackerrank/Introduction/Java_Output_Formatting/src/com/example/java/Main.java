package com.example.java;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            int lenghthOfS1=s1.length();
            System.out.printf(s1);
            for(int j=0;j<15-lenghthOfS1;j++){
                System.out.printf(" ");
            }
            if(x>=0 && x<=9){
                System.out.printf("00");
            }
            else if(x>=10 && x<=99){
                System.out.printf("0");
            }
            System.out.println(x);
            //Complete this line
        }
        System.out.println("================================");
    }


}
