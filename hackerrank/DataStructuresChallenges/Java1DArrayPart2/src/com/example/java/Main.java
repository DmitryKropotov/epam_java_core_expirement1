package com.example.java;

import java.util.Scanner;

public class Main {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.

        int[] indexIsAvailable = new int[game.length];//1 means available, -1 means abadonded, 0 means not defined, default values are 0 (not defined)
        indexIsAvailable[0] = 1;

        if(leap>=game.length){//in this case we can jump throw all array to its end
            return true;
        }

        //first loop
        for(int i = 1; i<game.length; i++){
            if(game[i]!=0){
                if(leap==0){//in this case one nonzero is enough to return false
                  return false;
                }
                indexIsAvailable[i] = -1;
            } else if(indexIsAvailable[i-1]==1 || i>=leap && indexIsAvailable[i-leap]==1){
                indexIsAvailable[i] = 1;
            } else if(i==game.length-1 && indexIsAvailable[i-1]==-1 && indexIsAvailable[i-leap]==-1){
                indexIsAvailable[i] = -1;
            }
        }

        if(leap==0){//we didn't run into any nonzero and can return true in this case
            return true;
        }

        boolean isZero;
        int count = 0;
        final int MAX_AMOUNT_OF_DO_WHILE_LOOP = game.length;
        do {
            isZero = false;
            //first loop in the couple
            for (int i = game.length - 2; i > 0; i--) {
                if (indexIsAvailable[i] == 0) {
                    if (indexIsAvailable[i + 1] == 1) {
                        indexIsAvailable[i] = 1;
                    } else if (indexIsAvailable[i + 1] == -1 && indexIsAvailable[i - 1] == -1 && (i < leap || i >= leap && indexIsAvailable[i - leap] == -1)) {
                        indexIsAvailable[i] = -1;
                    }
                }
            }

            //second loop in the couple
            for (int i = 1; i < game.length; i++) {
                if (indexIsAvailable[i] == 0) {
                    if (indexIsAvailable[i - 1] == 1 || (i >= leap && indexIsAvailable[i - leap] == 1) || (i != game.length - 1 && indexIsAvailable[i + 1] == 1)) {
                        indexIsAvailable[i] = 1;
                    } else if (indexIsAvailable[i - 1] == -1 && (i < leap || i >= leap && indexIsAvailable[i - leap] == -1) && (i == game.length - 1 || i != game.length - 1 && indexIsAvailable[i + 1] == -1)) {
                        indexIsAvailable[i] = -1;
                    } else if(count==MAX_AMOUNT_OF_DO_WHILE_LOOP-1){
                        int lastAdjactentZeros = i;
                        boolean minusLeapIsNotAvailable = false;
                        while(lastAdjactentZeros+1<game.length && indexIsAvailable[lastAdjactentZeros+1]==0){
                            lastAdjactentZeros++;
                            if(lastAdjactentZeros>=leap && indexIsAvailable[lastAdjactentZeros-leap]==-1){
                                minusLeapIsNotAvailable = true;
                            }
                        }
                        if(minusLeapIsNotAvailable){
                            for(int j = i; j<=lastAdjactentZeros; j++){
                                indexIsAvailable[j]=-1;
                            }
                        }
                    } else{
                        isZero = true;
                    }
                }
            }

            count++;
        }while(isZero && count<MAX_AMOUNT_OF_DO_WHILE_LOOP);



        for(int i = game.length-leap; i<game.length; i++){
            if(indexIsAvailable[i]==1){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
