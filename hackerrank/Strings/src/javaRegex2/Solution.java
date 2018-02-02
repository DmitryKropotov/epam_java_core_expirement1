package javaRegex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        String regex ="(\\b\\w+)\\s+(\\1\\s+)?\\1\\b";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            for (int i=0; i<input.length(); i++){
                char c = input.charAt(i);
                System.out.println(c);
            }
            System.out.println(input);

            Matcher m = p.matcher(input);

            //System.out.println(regex);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
                //System.out.println(input);
            }

            // Prints the modified sentence.
            for (int i=0; i<input.length(); i++){
                char c = input.charAt(i);
                System.out.println(c);
            }
            System.out.println(input);
        }

        in.close();
    }
}

//(Solution.class.getResourceAsStream("input.txt"));