package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(altPairs("kitten"));
    }

    public static String altPairs(String str) {
        String strToReturn="";
        int indexToCopy=0;
        boolean addThree=false;
        while(indexToCopy<str.length()){
            strToReturn=strToReturn+str.substring(indexToCopy, indexToCopy+1);
            if(!addThree){
                indexToCopy++;
            }
            else{
                indexToCopy=indexToCopy+3;
            }
            addThree=!addThree;
        }
        return strToReturn;
    }
}
