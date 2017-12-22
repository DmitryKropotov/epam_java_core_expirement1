package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(zipZap("zzp"));
    }

    public static String zipZap(String str) {


        //Algorithm 1
        /*final int LENGTH_OF_STR = str.length();
          if(LENGTH_OF_STR==0 || LENGTH_OF_STR==1 || LENGTH_OF_STR==2){//In this case we don't have to change the str
             return str;//NOTE: If LENGTH_OF_STR==2, the following algorithm would work fine, but we return str here to do it quick
          }

          String result = String.valueOf(str.charAt(0));//first char is coming to result anyway

          for(int i = 1; i<LENGTH_OF_STR-1; i++){//in the loop we check, if a char from first to (LENGTH_OF_STR-1)th satisfies conditions to be added to the result
            if(str.charAt(i-1)!='z' || str.charAt(i+1)!='p'){
                result = result.concat(String.valueOf(str.charAt(i)));
            }
          }

        result=result.concat(String.valueOf(str.charAt(LENGTH_OF_STR-1)));//last char is coming to result anyway

        return result;*/

        //Algorithm 2
        /*for(int i = 1; i<str.length()-1; i++){//in the loop we find chars to remove from str
            if(str.charAt(i-1)=='z' && str.charAt(i+1)=='p'){
                str = str.substring(0, i)+str.substring(i+1, str.length());
            }
        }
        return str;*/

        //Algorithm 3
        int indexOfZ = 0;
        do{
            indexOfZ = str.indexOf('z', indexOfZ);//we are looking for next z in every iteration of the loop
            if(indexOfZ!=-1 && indexOfZ<str.length()-2 && str.charAt(indexOfZ+2)=='p'){//We check, if there is z in the str,
            //if it is, we check, if there are at least more two symbols after z, and if they are, we check,
            //if there is p after 2 symbols of z to remove symbol between z and p.
                str=str.substring(0, indexOfZ)+"zp"+str.substring(indexOfZ+3, str.length());
            }
            indexOfZ++;//We have to start new iteration of the loop since value of indexOfZ, following position of previous indexOfZ.
        }while(indexOfZ-1!=-1 && indexOfZ-1<str.length()-3);//but we have to check conditions to escape from loop with previous value

        return str;
    }
}
