package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(stringX("sxxxs"));

    }

    public static String stringX(String str) {
        if(str.length()==0 || str.length()==1){
            return str;
        }

        String strToReturn=str.substring(0, 1);
        for(int i=1; i<str.length()-1; i++){
            if(str.charAt(i)!='x'){
                strToReturn=strToReturn+str.substring(i, i+1);
            }
        }
        strToReturn=strToReturn+str.substring(str.length()-1, str.length());
        return strToReturn;
    }
}
