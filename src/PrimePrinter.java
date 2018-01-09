/**
 * Created by 20133557 on 1/4/2018.
 */

import java.util.Scanner;

public class PrimePrinter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Prime Number Factorial Calculator\n");
        System.out.println("Please enter a number greater than 1:");
        while(!scanner.hasNextInt()) {
            System.out.println("Please enter a number greater than 1:");
            scanner.nextLine();
        }
        int upperLimit = scanner.nextInt();
        System.out.println("\nInput Number | Prime Factors");
        System.out.println("-----------------------------");
        printPrime(upperLimit);
    }

    /**
     * Prints the prime factors for each integer between 2 and upperLimit
     * @param upperLimit positive integer set by user
     */
    private static void printPrime(int upperLimit){
        for (int i=2; i<=upperLimit; i++){
            System.out.printf("     %-8d|     %s\n", i,
                        PrimeNumberCalculator.getPrimeFactors(i));
        }
    }
}
