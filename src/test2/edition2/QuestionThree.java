package test2.edition2;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*
    Maak een array van 20 getallen aan en vul deze met random getallen.
    Zoek het kleinste en het grootste getal en druk deze af.
    Druk de array zelf ook af ter controle.
 */
public class QuestionThree {
    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int[] numbers = new int[20];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int n = random.nextInt();
            numbers[i] = n;
            max = Math.max(max, n);
            min = Math.min(min, n);
        }

        System.out.printf(
                "Array: %s%n\t- min value = %d%n\t- max value = %d%n",
                Arrays.toString(numbers),
                min,
                max
        );
    }
}
