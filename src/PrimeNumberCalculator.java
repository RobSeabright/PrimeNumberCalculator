/**
 * Created by 20133557 on 1/4/2018.
 */

import java.lang.*;

public class PrimeNumberCalculator {

    private static String primeFactors;

    /**
     *
     * @param i positive integer i
     */
    public static String isPrime(int i){

        if(i%2==0) return i==2 ? "true" : "false";

        for(int j=3; j<=Math.sqrt(i); j+=2){
            if(i%j==0) return "false";
        }
        return "true";
    }

    /**
     *
     * @param i positive integer i
     * @return
     */
    public static String getUniquePrimeRepresentation(int i){
        primeFactors = "";
        primeFactors = isPrime(i);
        return primeFactors;
    }
}
