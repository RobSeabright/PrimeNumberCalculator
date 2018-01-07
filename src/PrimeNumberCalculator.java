/**
 * Created by 20133557 on 1/4/2018.
 */

import java.lang.*;

public class PrimeNumberCalculator {

    public static StringBuilder primeFactors = new StringBuilder("");

    /**
     *
     * @param i positive integer to be factored
     */
    private static void getPrimeFactors(int i){

        while(i%2==0){
            primeFactors.append("2*");
            i /= 2;
        }

        for(int j=3; j<=Math.sqrt(i); j+=2){
            while(i%j==0){
                primeFactors.append(j).append("*");
                i /= j;
            }
        }
        if(i > 2){
            primeFactors.append(i).append("*");
        }
    }

    /**
     *
     * @param i positive integer i
     * @return primeFactors StringBuilder containing the prime factors of i
     */
    public static StringBuilder getUniquePrimeRepresentation(int i){
        primeFactors.setLength(0);
        getPrimeFactors(i);
        primeFactors.setLength(primeFactors.length()-1);
        return primeFactors;
    }
}

//    Used to find if a number is prime or not - legacy

//    public static String isPrime(int i){
//
//        if(i%2==0) return i==2 ? "true" : "false";
//
//        for(int j=3; j<=Math.sqrt(i); j+=2){
//            if(i%j==0) return "false";
//        }
//        return "true";
//    }
