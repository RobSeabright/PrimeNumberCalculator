/**
 * Created by 20133557 on 1/4/2018.
 */

import java.lang.*;

public class PrimeNumberCalculator {

    private static String primeFactors;


    private static String getPrimeFactors(int i){

        while(i%2==0){
            primeFactors += "2*";
            i /= 2;
        }

        for(int j=3; j<=Math.sqrt(i); j+=2){
            while(i%j==0){
                primeFactors += j+"*";
                i /= j;
            }
        }
        if(i > 2){
            primeFactors += i+"*";
        }
        return primeFactors;
    }


    /**
     *
     * @param i positive integer i
     * @return
     */
    public static String getUniquePrimeRepresentation(int i){
        primeFactors = "";
        primeFactors = getPrimeFactors(i);
        primeFactors = primeFactors.substring(0, primeFactors.length() - 1);
        return primeFactors;
    }
}


//    public static String isPrime(int i){
//
//        if(i%2==0) return i==2 ? "true" : "false";
//
//        for(int j=3; j<=Math.sqrt(i); j+=2){
//            if(i%j==0) return "false";
//        }
//        return "true";
//    }
