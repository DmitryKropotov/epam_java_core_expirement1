package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        xyBalance("xxy");
    }

    public static boolean xyBalance(String str) {

        boolean balanced=true;//String is balanced by defalult, because if there is no 'x',
        //there is no 'x', not satisfied by conditions(look Fihtegoltz "mathematical analysis")

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='x'){
                balanced=false;
            }

            if(str.charAt(i)=='y'){
                balanced=true;
            }
        }

        return balanced;
    }
}
