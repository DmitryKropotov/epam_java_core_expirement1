package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sameStarChar("x*xx*"));

    }

    public static boolean sameStarChar(String str) {
        int indexOfStar=0;//we start looking for '*' since index 1 (we will add 1 to indexOFStar in the function, which is searhing for '*')

        do{//searching for '*' and check, if it doesn't sutisfy conditions
            indexOfStar = str.indexOf('*', indexOfStar+1);
            //if indexOfStar is equal -1 (there is no more '*') or str.length()-1, we don't have to check, if it doesn't sutisfy conditions.
            //We have to ignore if statement, finish the loop and return true, because there is no more '*' or this is the last one.
            if(indexOfStar!=-1 && indexOfStar!=str.length()-1 && str.charAt(indexOfStar-1)!=str.charAt(indexOfStar+1)){//if we found such a '*', we return false
                return false;
            }
        }while(indexOfStar!=-1 && indexOfStar!=str.length()-1);

        return true;
    }
}
