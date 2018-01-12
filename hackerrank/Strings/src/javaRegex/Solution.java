package javaRegex;

import java.util.Scanner;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex{
    final static String pattern = "(0{1,2}|00"+'\\'+"d|"+'\\'+"d{1,2}|0"+'\\'+"d{1,2}|1"+'\\'+"d{1,2}"+'\\'+"d|2[0-4]"+'\\'+"d|25[0-5])"+'\\'+"."+
            "(0{1,2}|00"+'\\'+"d|"+'\\'+"d{1,2}|0"+'\\'+"d{1,2}|1"+'\\'+"d{1,2}"+'\\'+"d|2[0-4]"+'\\'+"d|25[0-5])"+'\\'+"."+
            "(0{1,2}|00"+'\\'+"d|"+'\\'+"d{1,2}|0"+'\\'+"d{1,2}|1"+'\\'+"d{1,2}"+'\\'+"d|2[0-4]"+'\\'+"d|25[0-5])"+'\\'+"."+
            "(0{1,2}|00"+'\\'+"d|"+'\\'+"d{1,2}|0"+'\\'+"d{1,2}|1"+'\\'+"d{1,2}"+'\\'+"d|2[0-4]"+'\\'+"d|25[0-5])";

}