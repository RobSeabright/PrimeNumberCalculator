/**
 * Created by 20133557 on 1/4/2018.
 */

public class PrimePrinter {

    public static void main(String[] args) {
        System.out.println("Prime Numbers Are Cool!");

        printPrime(10);
    }

    public static void printPrime(int upperlimit){
        for (int i=2; i<upperlimit; i++){
            System.out.printf("%d: %s\n", i,
                        PrimeNumberCalculator.getUniquePrimeRepresentation(i));
        }
    }
}
