package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(starOut("ab*cd"));
    }



    public static String starOut(String str) {

        if(str.length()==0 || str.length()==1 && str.charAt(0)=='*'){//preventing StringOutOfIndexException
            return "";
        }
        else if(str.length()==1){
            return str;
        }

        String result;
        if(str.charAt(0)!='*' && str.charAt(1)!='*'){//if first char satisfies conditions to be added, we add it to result
            result = str.substring(0, 1);
        }
        else{
            result = "";
        }

        for(int i=1; i<str.length()-1; i++){//We check chars from second to penultimate for conditions to be added
            if(str.charAt(i)!='*' && str.charAt(i-1)!='*' && str.charAt(i+1)!='*') {
                result = result.concat(str.substring(i, i + 1));
            }
        }

        if(str.charAt(str.length()-1)!='*' && str.charAt(str.length()-2)!='*'){//if last char satisfies conditions to be added, we add it to result
            result = result.concat(str.substring(str.length()-1, str.length()));
        }

        return result;
    }

}
