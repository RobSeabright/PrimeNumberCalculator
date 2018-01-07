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

    public static void printPrime(int upperlimit){
        for (int i=2; i<=upperlimit; i++){
            System.out.printf("     %-8d|     %s\n", i,
                        PrimeNumberCalculator.getUniquePrimeRepresentation(i));
        }
    }
}
