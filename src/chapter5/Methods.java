package chapter5;

import tools.InputRequests;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        int range = InputRequests.requestInt(
                scanner,
                "Please input top range for prime query:",
                i -> i > 0,
                "Only Whole Numbers are allowed!");

        checkRangeForPrimes(range);

        scanner.close();
    }

    public static void checkRangeForPrimes(int range) {

        int count = 0;
        for (int i = 2; i <= range; i += 2) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }

            if (i == 2) i--;    //-- only check uneven numbers larger than 2
        }

        System.out.println("Found " + count + " primes within range: 0 - " + range);
    }

    public static boolean isPrime(int number) {

        for (int i = 2; i < number/2; i++)     //no factors > number/2 && < number exist
            if (number % i == 0)
                return false;

        return number > 1;
    }
}
