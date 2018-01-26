package com.example.java;

import java.io.*;
import java.security.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // write your code here
            DoNotTerminate.forbidExit();

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int num = Integer.parseInt(br.readLine().trim());
                Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private

                //my code beginning
                o = new Inner().new Private();
                Inner.Private aprivate = new Inner().new Private();
                System.out.println((num&num));
                System.out.println((num&num-1));
                System.out.println((num&num-1)==0);
                System.out.println(num+ " is "+aprivate.powerof2(num));
                //my code end

                System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

            }//end of try

            catch (DoNotTerminate.ExitTrappedException e) {
                System.out.println("Unsuccessful Termination!!");
            }
    }//end of main

    static class Inner{
        private class Private{
            public String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }//end of Inner

}//end of Solution

class DoNotTerminate { //This class prevents exit(0)

     public static class ExitTrappedException extends SecurityException {
         private static final long serialVersionUID = 1L;
     }

        public static void forbidExit() {
            final SecurityManager securityManager = new SecurityManager() {
                @Override
                public void checkPermission(Permission permission) {
                    if (permission.getName().contains("exitVM")) {
                        throw new ExitTrappedException();
                    }
                }
            };
            System.setSecurityManager(securityManager);
     }
}

