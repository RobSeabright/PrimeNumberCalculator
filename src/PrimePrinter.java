/**
 * Created by 20133557 on 1/4/2018.
 */

public class PrimePrinter {

    public static void main(String[] args) {
        System.out.println("Prime Number Factorial Calculator");
        System.out.println("Input Number | Prime Factors");
        System.out.println("-----------------------------");
        printPrime(33);
    }

    /**
     * Prints the prime factors for each integer between 2 and upperLimit
     * @param upperLimit positive integer set by user
     */
    public static void printPrime(int upperLimit){
        for (int i=2; i<=upperLimit; i++){
            System.out.printf("     %-8d|     %s\n", i,
                        PrimeNumberCalculator.getUniquePrimeRepresentation(i));
        }
    }
}
