package Java_Primality_Test;

import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        // Write your code here.
        if(n.isProbablePrime(100)){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
