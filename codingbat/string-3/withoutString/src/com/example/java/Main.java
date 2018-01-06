package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(withoutString("This is a FISH", "IS"));
    }

    public static String withoutString(String base, String remove) {
        String result = base;
        base=base.toLowerCase();
        remove=remove.toLowerCase();
        int amountOfRemovedCharacters = 0;
        final int LENGTH_OF_BASE = base.length(), LENGTH_OF_REMOVE = remove.length();
        for(int i=0; i<LENGTH_OF_BASE-LENGTH_OF_REMOVE+1; i++){
            if(base.substring(i, i+LENGTH_OF_REMOVE).equals(remove)){
                result = result.substring(0, i-amountOfRemovedCharacters)+result.substring(i-amountOfRemovedCharacters+LENGTH_OF_REMOVE, result.length());
                amountOfRemovedCharacters = amountOfRemovedCharacters+LENGTH_OF_REMOVE;
                i=i+LENGTH_OF_REMOVE-1;
            }
        }
        return result;
    }
}
