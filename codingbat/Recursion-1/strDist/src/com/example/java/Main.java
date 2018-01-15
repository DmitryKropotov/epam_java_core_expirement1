package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(strDist("catcowcat", "cat"));
    }

    public static int strDist(String str, String sub) {
        if(str.length()<sub.length()){
            return 0;
        }
        if(str.startsWith(sub)){
            int beginOfNextSub = 1;
            while(beginOfNextSub<str.length()-sub.length()+1 && !str.substring(beginOfNextSub, beginOfNextSub+sub.length()).equals(sub)){
                beginOfNextSub++;
            }
            if(beginOfNextSub==str.length()-sub.length()+1){
                return sub.length();
            }
            return beginOfNextSub+strDist(str.substring(beginOfNextSub, str.length()), sub);
        } else{
            return strDist(str.substring(1, str.length()), sub);
        }
    }
}
