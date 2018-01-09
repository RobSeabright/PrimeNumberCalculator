/**
 * Created by 20133557 on 1/4/2018.
 */

import org.jetbrains.annotations.NotNull;

import java.lang.*;

public class PrimeNumberCalculator {

    /**
     * @param n positive integer to be factored
     */
    @NotNull
    public static String getPrimeFactors(int n) {

        StringBuilder primeFactors = new StringBuilder("");

        while (n % 2 == 0) {
            primeFactors.append("2*");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                primeFactors.append(i).append("*");
                n /= i;
            }
        }
        if (n > 2) {
            primeFactors.append(n).append("*");
        }

        primeFactors.setLength(primeFactors.length() - 1);
        return primeFactors.toString();
    }
}