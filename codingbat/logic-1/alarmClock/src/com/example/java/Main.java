package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(alarmClock(6, true));
    }

    public static String alarmClock(int day, boolean vacation) {
        if(!vacation && day>=1 && day<=5){
            return "7:00";
        }
        if((!vacation && (day==0 || day==6)) || (vacation && day>=1 && day<=5)){
            return "10:00";
        }
        return "off";
    }
}
