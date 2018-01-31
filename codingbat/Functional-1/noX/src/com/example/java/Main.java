package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Zenitx");
        strings.add("AAddxxxdaaxdsa");
        strings.add("dfDxxddxdx");
        System.out.println(noX(strings));
    }

    public static List<String> noX(List<String> strings) {
        strings.replaceAll(n->removedX(n));
        return strings;
    }

    static String removedX(String str){
        String result="";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!='x'){
                result=result+str.substring(i, i+1);
            }
        }
        return result;
    }
}
