package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] a = {"a", "a", "b", "b", "c"};
        String[] b = {"a", "b", "b", "b", "c"};
        System.out.println(commonTwo(a, b));
    }

    public static int commonTwo(String[] a, String[] b) {
        int result = 0;
        for(int i=0; i<a.length; i++){
            String currentString = a[i];
            int amountOfCurrentStringInA = 1;
            while(i+amountOfCurrentStringInA<a.length && a[i+amountOfCurrentStringInA].equals(currentString)){
                amountOfCurrentStringInA++;
            }
            i = i + amountOfCurrentStringInA - 1;
            if(isStringInArray(currentString, b)){
                result++;
            }
        }
        return result;
    }

    static boolean isStringInArray(String str, String[] arrayOfStrings){
        int numberOfStrInArray = arrayOfStrings.length/2;
        int lowerBoundary = 0;
        int higherBoundary = arrayOfStrings.length-1;
        while(!arrayOfStrings[numberOfStrInArray].equals(str)){
            if(arrayOfStrings[numberOfStrInArray].compareTo(str)>0){
                higherBoundary = numberOfStrInArray-1;
            }
            if(arrayOfStrings[numberOfStrInArray].compareTo(str)<0){
                lowerBoundary = numberOfStrInArray+1;
            }
            if(higherBoundary-lowerBoundary<0){
                return false;
            } else{
                numberOfStrInArray = (higherBoundary+lowerBoundary)/2;
            }
        }
        return true;
    }
}
