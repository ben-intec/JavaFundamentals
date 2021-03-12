package Chapter5;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int range = getRangeMaximum(scanner);

        checkRangeForPrimes(range);

        scanner.close();
    }

    public static void checkRangeForPrimes(int range) {

        int count = 0;
        for (int i = 0; i <= range; i+= 2) {
            if(isPrime(i)) {
                System.out.println(i);
                count++;
            }

            if (i == 2) i--;    //-- only check uneven numbers larger than 2
        }

        System.out.println("Found " + count + " primes smaller than or equal to " + range);
    }

    public static boolean isPrime(int number) {

        for (int i = 2; i < number/2; i++)     //no factors > number/2 && < number exist
            if (number % i == 0)
                return false;

        return number > 1;
    }

    public static int getRangeMaximum(@NotNull Scanner scanner) {

        int k ;
        System.out.println("Please input top range for prime query:");

        while(!scanner.hasNextInt()) {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid number.%n", input);
        }

        k = scanner.nextInt();

        while (k < 0) {
            k = scanner.nextInt();
            System.out.printf("%d is not a valid number. Only Whole Numbers are allowed%n", k);
        }


        return k;
    }
}
