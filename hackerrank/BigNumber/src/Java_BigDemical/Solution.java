package Java_BigDemical;

import java.math.BigDecimal;
import java.util.*;

public class Solution {

    public static void main(String []args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        boolean[] nonStandartFormat = new boolean[n];
        Map<BigDecimal, String> sWithNonStandartFormat = new HashMap<>();
        BigDecimal[] sort = new BigDecimal[n+2];
        for(int i=0; i<n; i++){
            sort[i] = new BigDecimal(s[i]);
            if(!s[i].matches("-?((0)|([1-9]"+'\\'+"d*))(."+'\\'+"d*[1-9])?")){
                nonStandartFormat[i] = true;
                sWithNonStandartFormat.put(sort[i], s[i]);
            }
        }
        for(int i=1; i<n; i++){
            BigDecimal checkedValue = sort[i];
            boolean nonStandartFormatOfCheckedValue = nonStandartFormat[i];
            for(int j=0; j<i; j++){//searching for element since beginning, which is less than checkedValue
                if(sort[j].compareTo(checkedValue)==-1){
                    for(int k=i; k>j; k--){//shift elements
                        sort[k] = sort[k-1];
                        nonStandartFormat[k] = nonStandartFormat[k-1];
                    }
                    sort[j] = checkedValue;
                    nonStandartFormat[j] = nonStandartFormatOfCheckedValue;
                    break;
                }
            }
        }
        //put to array s final sequence of values
        for(int i=0; i<n; i++){
            if(!nonStandartFormat[i]){
                s[i]=sort[i].toString();
            } else {
                s[i] = sWithNonStandartFormat.get(sort[i]);
            }
        }


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
