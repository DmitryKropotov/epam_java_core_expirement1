package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(userCompare("aa", 1, "bb", 3));
    }

    public static int userCompare(String aName, int aId, String bName, int bId) {
        if(aName.compareTo(bName)<0 || aName.compareTo(bName)==0 && aId<bId){
            return -1;
        } else if(aName.compareTo(bName)>0 || aName.compareTo(bName)==0 && aId>bId){
            return 1;
        } else {
            return 0;
        }
    }
}
