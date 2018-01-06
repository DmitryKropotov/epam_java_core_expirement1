package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] a = {1, 2, 2, 4};
        System.out.println(twoTwo(a));
    }

    public static boolean twoTwo(int[] nums) {
        boolean twoWasMet = false, secondTwoInRowWasMet = false;
        boolean notTwoAfterTwoWasMet = false;
        for(int i: nums){
            if(i==2){//Firstly, we check, if this number is 'two' or not
                if(notTwoAfterTwoWasMet){//If we have met another number(not 2) after '2' before, this '2' isn't next to another 2
                    return false;
                }
                if(twoWasMet){//If we have met '2' before, we have to fix, that it isn't first '2' in a row, we meet.
                    //This is not first '2' in a row. If it was first '2' in a row (but twoWasMet before), branch if(notTwoAfter2WasMet) worked out
                    secondTwoInRowWasMet = true;
                }
                twoWasMet = true;
            } else if(twoWasMet){//If this number isn't two, we have to check, if we have met '2' before. If not, continue the loop.
                if(secondTwoInRowWasMet){//If we have, we fix that we have met another number(not 2)
                    notTwoAfterTwoWasMet = true;
                } else {//but if there was only one '2', we should return false, because there is no 2 next to another 2
                    return false;
                }
            }
        }

        if(twoWasMet){//If we have met '2', we should return true, if we had second '2' in a row,
            // but we should return false, if we didn't
            return secondTwoInRowWasMet;
        } else {//If we haven't met '2', we should return true
            return true;
        }
    }
}
