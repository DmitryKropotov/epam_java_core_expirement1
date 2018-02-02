package tagContentExtrator;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    static String firstTag(String htmlLine){
        int counterTriangleBrackets = 0;
        String tag = "";
        int startOfTag = 0;
        for(int i=0; i<htmlLine.length(); i++){
            if(htmlLine.charAt(i)=='<'){
                counterTriangleBrackets++;
                if(counterTriangleBrackets>0){
                    startOfTag = i+1;
                }
            } else if(htmlLine.charAt(i)=='>'){
                counterTriangleBrackets--;
                if(counterTriangleBrackets==0){
                    tag = htmlLine.substring(startOfTag, i);
                    break;
                }
            }
        }
        return tag;
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String regex = "<(.+)>.+<"+'/'+'\\'+"1>";
        Pattern p = Pattern.compile(regex);
        while(testCases>0){
            String line = in.nextLine();
            //Write your code here
            Matcher m = p.matcher(line);
            if(!m.find()){
                System.out.println("None");
            } else {
                boolean appearencePrintedContent = false;
                int count = 0;
                do{//loop for all appearances of "<tag>content</tag>"
                    String htmlLine = m.group();
                    String regexSplitContent = "<[.\\&&[^/]]*>";
                    Pattern p2 = Pattern.compile(regexSplitContent);
                    Matcher m2 = p2.matcher(htmlLine);

                    String tag = "";
                    do{
                        tag = firstTag(htmlLine);
                        htmlLine = htmlLine.split(regexSplitContent)[1];
                        count++;
                        m2 = p2.matcher(htmlLine);
                    }while(m2.find());
                    regexSplitContent = "</"+tag+">";
                    //p2 = Pattern.compile(regexSplitContent);
                    //m2 = p2.matcher(htmlLine);
                    //do{
                    for(int i=0; i<htmlLine.length()-tag.length()-2; i++){
                        if(htmlLine.substring(i, i+tag.length()+3).equals("</"+tag+">")){
                            htmlLine = htmlLine.substring(0, i);
                            break;
                        }
                    }
                    //String[] splitedHtmlLine = htmlLine.split(regexSplitContent);
                    //if(/*m2.find() &&*/ !htmlLine.matches(regexSplitContent) && splitedHtmlLine.length!=0) {
                    //    htmlLine = splitedHtmlLine[0];
                    //}
                    //m2 = p2.matcher("</"+tag+">");
                    //}while(m2.find());
                    if(!htmlLine.contains("<") && !htmlLine.isEmpty()){
                        System.out.println(htmlLine);
                        appearencePrintedContent = true;
                    }
                    count++;
                    if(testCases==82 && count==24){
                        System.out.println("DEBUG");
                    }
                    System.out.println("testCases= " + testCases);
                    System.out.println("count= " + count);
                } while (m.find());
                if(!appearencePrintedContent){
                    System.out.println("None");
                }
            }
            testCases--;
        }
    }
}
